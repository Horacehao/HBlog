package com.hblog.dao;

import com.hblog.domain.BookInfo;

import java.util.List;

public interface BookInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BookInfo record);

    BookInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(BookInfo record);

    List<BookInfo> selectAll();

    BookInfo selectBySlug(Long slug);
}