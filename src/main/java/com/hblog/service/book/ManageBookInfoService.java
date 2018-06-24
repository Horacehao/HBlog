package com.hblog.service.book;

import com.hblog.domain.BookInfo;
import com.hblog.web.controller.bookmanage.BookInfoFormBean;

import java.util.List;

public interface ManageBookInfoService {

    void insert(BookInfoFormBean bookInfoFormBean);

    void update(BookInfoFormBean bookInfoFormBean);

    List<BookInfo> findList();

    BookInfo findById(Integer id);
}
