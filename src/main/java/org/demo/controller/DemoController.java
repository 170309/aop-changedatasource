package org.demo.controller;

import org.demo.pojo.db2.Admin;
import org.demo.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @Autowired
    private IDemoService demoService;

    @RequestMapping("/")
    public String viewIndex(){
        return "index";
    }


    @RequestMapping("add.do")
    public void add(Admin admin){
        if(demoService.addAdmin(admin) != 0){
            System.out.println("插入成功");
        };
    }

    @RequestMapping("query.do")
    public void query(){
        System.out.println(demoService.queryUser());
    }


}
