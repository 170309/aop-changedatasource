package org.demo.service.impl;

import org.demo.dao.db1.UserMapper;
import org.demo.dao.db2.AdminMapper;
import org.demo.pojo.db2.Admin;
import org.demo.service.IDemoService;
import org.demo.util.annotation.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements IDemoService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AdminMapper adminMapper;


    public String queryUser(){
        System.out.println("查询username");
        return userMapper.selectByPrimaryKey(1).getUsername();
    }


    public int addAdmin(Admin admin){
        System.out.println("添加Admin");
        return adminMapper.insertSelective(admin);
    }




}
