package com.jmdf.mapper;

import com.jmdf.pojo.Users;

import java.util.List;

/**
 * Created by 25788 on 2018/12/10.
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();

}
