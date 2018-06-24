package com.hblog.service.record;


import com.hblog.domain.RecordInfo;

import java.util.List;

public interface ManageRecordService {

    int insert(RecordInfo recordInfo);

    List<RecordInfo> list();

    RecordInfo findById(Integer id);

    int update(RecordInfo recordInfo);

    int delete(Integer id);
}
