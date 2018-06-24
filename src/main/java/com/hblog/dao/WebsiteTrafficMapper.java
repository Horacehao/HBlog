package com.hblog.dao;

import com.hblog.domain.WebsiteTraffic;

import java.util.List;

public interface WebsiteTrafficMapper {

    int insert(WebsiteTraffic record);

    List<WebsiteTraffic> queryByIpAddress(String ipAddress);
}