package com.hblog.service;

import com.hblog.domain.ArticleInfo;
import com.hblog.service.article.ArticleInfoVO;
import com.hblog.service.article.SimpleArticleInfo;

public interface CommonUtilsService {

    ArticleInfoVO transArticleInfoVO(ArticleInfo articleInfo);

    SimpleArticleInfo transArticleToSimpleArticle(ArticleInfo articleInfo);
}
