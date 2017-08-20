package org.demo.controller;

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

    @RequestMapping("in.do")
    public void deIn(){
        System.out.println("====================输入====================");
    }


    @RequestMapping("out.do")
    public void deOut(){
        System.out.println("====================输出====================");
    }

    @RequestMapping("service.do")
    public void doDemoServiceMethod(){
        String x= "xxxxxxxxxxxx";
        demoService.demoOut(x);
    }


    @RequestMapping("add.do")
    public void doDemoAddServiceMethod(){
        demoService.addUser();
        demoService.addCategory();
    }


}
