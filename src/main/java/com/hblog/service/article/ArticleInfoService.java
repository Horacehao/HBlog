package com.hblog.service.article;

import com.hblog.core.orm.PageRequest;
import com.hblog.core.orm.Pagination;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ArticleInfoService {

    ArticleInfoVO findArticleBySlug(Long slug, String ipAddress);

    /**
     * 根据pageRequest分页
     * @return 分页对象
     */
    Pagination<ArticleInfoVO> page(PageRequest pageRequest, HttpServletRequest request);
}
