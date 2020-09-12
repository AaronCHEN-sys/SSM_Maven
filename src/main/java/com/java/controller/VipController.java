package com.java.controller;

import com.java.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Description:	   <br/>
 * Date:     0011, September 11 21:41 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
@Controller
public class VipController {

    @Autowired
    private VipService vipService;

    @RequestMapping("/getVip.do")
    @ResponseBody
    public List<Map<String, Object>> getVip() {
        return vipService.findVip();
    }

}
