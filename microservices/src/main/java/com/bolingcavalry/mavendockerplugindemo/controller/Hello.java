package com.bolingcavalry.mavendockerplugindemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

@RestController
public class Hello {

    @RequestMapping("/")
    public String sayHello(){
    	//修改返回的字符串的内容
        return "123456. Hello jenkins, " + new Date();
    }
	
	@RequestMapping("/getjson")
    public String getjson(){
        Map< String , Object > jsonMap = new HashMap< String , Object>();
        jsonMap.put("a",1);
        jsonMap.put("b","");
        jsonMap.put("c",null);
        jsonMap.put("d","zhenghuasheng");
        String str = JSONObject.toJSONString(jsonMap);
        return str;
    }
}
