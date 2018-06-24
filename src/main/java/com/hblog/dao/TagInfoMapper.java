package com.hblog.dao;

import com.hblog.domain.TagInfo;

public interface TagInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TagInfo record);

    int insertSelective(TagInfo record);

    TagInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TagInfo record);

    int updateByPrimaryKey(TagInfo record);
}