package com.java.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface VipMapper {

    List<Map<String, Object>> selectVip();
}
