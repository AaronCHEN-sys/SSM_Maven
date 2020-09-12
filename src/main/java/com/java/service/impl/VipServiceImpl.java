package com.java.service.impl;

import com.java.mapper.VipMapper;
import com.java.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Description:	   <br/>
 * Date:     0011, September 11 21:49 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
@Service
public class VipServiceImpl implements VipService {

    @Autowired
    private VipMapper vipMapper;

    @Override
    public List<Map<String, Object>> findVip() {
        return vipMapper.selectVip();

    }


}
