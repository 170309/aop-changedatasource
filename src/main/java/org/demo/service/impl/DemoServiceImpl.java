package org.demo.service.impl;

import org.demo.service.IDemoService;
import org.demo.util.annotation.Demo;
import org.springframework.stereotype.Service;

@Service("demoService")

public class DemoServiceImpl implements IDemoService {


    @Demo(db = "0000")
    public void demoOut(String x){
        System.out.println("服务测试 ===" + x);
    }

    @Demo(db = "11111")
    public void addUser(){
        System.out.println("添加用户");
    }


    @Demo(db = "2222")
    public void addCategory(){
        System.out.println("添加分类");
    }

}
