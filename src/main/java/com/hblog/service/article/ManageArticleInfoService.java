package com.hblog.service.article;

import com.hblog.domain.ArticleInfo;
import com.hblog.web.controller.articlemanage.ArticleInfoFormBean;

import java.util.List;

public interface ManageArticleInfoService {

    void insert(ArticleInfoFormBean articleInfoFormBean);

    List<ArticleInfo> findListByCategorySlug(Long categorySlug);

    int updateArticleEnabled(int articleId);

    ArticleInfo findById(Integer id);

    int updateArticle(ArticleInfoFormBean articleInfoFormBean);
}
