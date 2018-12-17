package com.baizhi.controller;

import com.baizhi.entity.Test;
import com.baizhi.mapper.TestMappper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestMappper testMappper;

    @RequestMapping("/queryAll")
    @ResponseBody
    public List<Test> queryAll() {
        List<Test> list = testMappper.selectAll();
        return list;
    }

    @RequestMapping("/test1")
    public String test1() {
        return "index";
    }
   /*   @RequestMapping("/insert")
        public void insert(){
          testMappper.insert(new Test(null,"999",55555));
    }*/
}
