package com.jmdf.service.impl;

import com.jmdf.mapper.UsersMapper;
import com.jmdf.pojo.Users;
import com.jmdf.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) {

        this.usersMapper.insertUser(users);
    }
}
