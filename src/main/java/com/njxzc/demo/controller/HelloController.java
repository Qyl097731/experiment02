package com.njxzc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * projectName:  experiment02
 * packageName: com.njxzc.demo.controller
 * date: 2020-10-24 21:14
 * copyright(c) 2020 南晓18卓工 邱依良
 */
@Controller
public class HelloController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/query")
    public Map<String,Object> query(){
        List<Map<String, Object> > list = jdbcTemplate.queryForList("select * from tb_reader");
        return list.get(0);
    }
}