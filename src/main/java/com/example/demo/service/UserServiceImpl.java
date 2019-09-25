package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.usertoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public usertoo findByUsername(String username) {
        return userMapper.findByUserName(username);
    }
}
