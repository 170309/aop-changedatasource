package org.demo.service;

import org.demo.pojo.db2.Admin;
import org.demo.util.annotation.DataSource;

public interface IDemoService {

    @DataSource(db = "db1")
    String queryUser();

    @DataSource(db = "db2")
    int addAdmin(Admin admin);
}
