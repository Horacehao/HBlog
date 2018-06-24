package com.hblog.service.category;

import com.google.common.collect.Lists;
import com.hblog.dao.ArticleInfoMapper;
import com.hblog.dao.CategoryInfoMapper;
import com.hblog.dao.SlugInfoMapper;
import com.hblog.domain.ArticleInfo;
import com.hblog.domain.CategoryInfo;
import com.hblog.domain.SlugInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service(value = "manageCategoryService")
@Transactional
public class ManageCategoryServiceImpl implements ManageCategoryService{

    @Autowired
    private CategoryInfoMapper categoryInfoMapper;

    @Autowired
    private ArticleInfoMapper articleInfoMapper;

    @Autowired
    private SlugInfoMapper slugInfoMapper;

    public void insert(CategoryInfo categoryInfo) {
        categoryInfo.setCreateTime(new Date());
        categoryInfoMapper.save(categoryInfo);

        SlugInfo slugInfo = slugInfoMapper.queryById(categoryInfo.getId());
        categoryInfo.setSlug(slugInfo.getSlug());
        categoryInfoMapper.update(categoryInfo);
    }

    public List<SimpleCategoryInfo> list() {
        List<SimpleCategoryInfo> simpleCategoryInfoList = Lists.newArrayList();

        List<CategoryInfo> categoryInfoList = categoryInfoMapper.selectAll();
        for(CategoryInfo categoryInfo : categoryInfoList) {
            SimpleCategoryInfo simpleCategoryInfo = new SimpleCategoryInfo();
            simpleCategoryInfo.setCategorySlug(categoryInfo.getSlug());
            simpleCategoryInfo.setTitle(categoryInfo.getTitle());

            List<ArticleInfo> articleInfoList = articleInfoMapper.findListByCategorySlug(categoryInfo.getSlug());
            simpleCategoryInfo.setNum(articleInfoList == null ? 0 : articleInfoList.size());

            simpleCategoryInfoList.add(simpleCategoryInfo);
        }

        return simpleCategoryInfoList;
    }

    public int updateBySlug(CategoryInfo categoryInfo) {
        categoryInfoMapper.updateBySlug(categoryInfo);
        return 0;
    }


}
