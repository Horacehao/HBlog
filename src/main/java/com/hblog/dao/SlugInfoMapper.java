package com.hblog.dao;

import com.hblog.domain.SlugInfo;

public interface SlugInfoMapper {

    int insert(SlugInfo record);

    SlugInfo queryById(Integer id);
}