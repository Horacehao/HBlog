package com.hblog.service.category;

import com.hblog.domain.CategoryInfo;

import java.util.List;

public interface ManageCategoryService {

    void insert(CategoryInfo categoryInfo);

    List<SimpleCategoryInfo> list();

    int updateBySlug(CategoryInfo categoryInfo);
}
