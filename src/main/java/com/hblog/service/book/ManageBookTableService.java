package com.hblog.service.book;

import com.hblog.domain.BookTable;

import java.util.List;

public interface ManageBookTableService {

    int insert(BookTable bookTable);

    int update(BookTable bookTable);

    int delete(Integer id);

    List<BookTable> findAll();
}
