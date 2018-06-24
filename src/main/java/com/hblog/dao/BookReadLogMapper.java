package com.hblog.dao;

import com.hblog.domain.BookReadLog;

public interface BookReadLogMapper {
    int insert(BookReadLog record);

    BookReadLog selectByPrimaryKey(Long id);

    Long selectNumById(Integer id);
}