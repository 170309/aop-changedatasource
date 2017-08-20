package org.demo.dao.db2;

import org.demo.pojo.db2.Admin;

public interface AdminMapper {
    int insert(Admin record);

    int insertSelective(Admin record);
}