package com.hblog.service;

import com.hblog.core.utils.GenerateUtils;
import com.hblog.dao.ArticleInfoMapper;
import com.hblog.dao.ArticleReadLogMapper;
import com.hblog.dao.CategoryInfoMapper;
import com.hblog.domain.ArticleInfo;
import com.hblog.domain.CategoryInfo;
import com.hblog.service.article.ArticleInfoVO;
import com.hblog.service.article.SimpleArticleInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("commonUtilsService")
@Transactional
public class CommonUtilsServiceImpl implements CommonUtilsService{

    @Resource
    private CategoryInfoMapper categoryInfoMapper;

    @Resource
    private ArticleReadLogMapper articleReadLogMapper;

    public ArticleInfoVO transArticleInfoVO(ArticleInfo articleInfo) {
        ArticleInfoVO articleInfoVO = new ArticleInfoVO();

        articleInfoVO.setTitle(articleInfo.getTitle());
        articleInfoVO.setDescription(articleInfo.getDescription());
        articleInfoVO.setContent(articleInfo.getContent());
        articleInfoVO.setTags(GenerateUtils.spiltStringByComma(articleInfo.getTag()));
        articleInfoVO.setCreateTime(articleInfo.getCreateTime());
        articleInfoVO.setArticleSlug(articleInfo.getSlug());
        articleInfoVO.setCategorySlug(articleInfo.getCategorySlug());
        articleInfoVO.setLikeNum(articleInfo.getThumb());

        Long categorySlug = articleInfo.getCategorySlug();
        CategoryInfo categoryInfo = categoryInfoMapper.selectBySlug(categorySlug);
        articleInfoVO.setCategoryName(categoryInfo.getTitle());

        Long clickNum = articleReadLogMapper.queryForClickNumByArticle(articleInfo.getSlug());
        articleInfoVO.setReviewNum(clickNum);

        return articleInfoVO;
    }

    public SimpleArticleInfo transArticleToSimpleArticle(ArticleInfo articleInfo){
        SimpleArticleInfo simpleArticleInfo = new SimpleArticleInfo();

        simpleArticleInfo.setCreateTime(articleInfo.getCreateTime());
        simpleArticleInfo.setSlug(articleInfo.getSlug());
        simpleArticleInfo.setTitle(articleInfo.getTitle());
        return simpleArticleInfo;
    }
}
