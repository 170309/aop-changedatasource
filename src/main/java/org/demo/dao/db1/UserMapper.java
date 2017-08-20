package org.demo.dao.db1;

import org.demo.pojo.db1.User;
import org.demo.util.annotation.Demo;

public interface UserMapper {

    @Demo(db = "db1")
    int deleteByPrimaryKey(Integer id);

    @Demo(db = "db1")
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}