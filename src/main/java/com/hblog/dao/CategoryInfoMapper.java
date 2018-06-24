package com.hblog.dao;

import com.hblog.domain.CategoryInfo;

import java.util.List;

public interface CategoryInfoMapper {

    CategoryInfo selectBySlug(Long slug);

    List<CategoryInfo> selectAll();

    int save(CategoryInfo categoryInfo);

    void update(CategoryInfo categoryInfo);

    void updateBySlug(CategoryInfo categoryInfo);
}