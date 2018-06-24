package com.hblog.dao;

import com.hblog.domain.RecordInfo;

import java.util.List;

public interface RecordInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RecordInfo record);

    int updateByPrimaryKey(RecordInfo record);

    List<RecordInfo> selectAll();

    RecordInfo selectById(Integer id);
}