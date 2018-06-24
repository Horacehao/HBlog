package com.hblog.service.category;

import com.hblog.service.article.ArticleInfoVO;

import java.util.List;

public interface CategoryInfoService {

    List<ArticleInfoVO> findArticleListByCategory(Long categorySlug);

    List<CategoryInfoVO> findCategoryInfoVO();

    List<SimpleCategoryInfo> findSimpleCategoryInfo();
}
