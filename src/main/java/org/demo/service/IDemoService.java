package org.demo.service;

import org.demo.pojo.db2.Admin;
import org.demo.util.annotation.Demo;

public interface IDemoService {

    @Demo(db = "db1")
    String queryUser();

    @Demo(db = "db2")
    int addAdmin(Admin admin);
}
