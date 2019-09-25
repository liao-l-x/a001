package com.example.demo.mapper;

import com.example.demo.model.usertoo;

public interface UserMapper {

    usertoo findByUserName(String userName);
}
