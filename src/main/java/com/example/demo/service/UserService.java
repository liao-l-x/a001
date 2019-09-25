package com.example.demo.service;


import com.example.demo.model.usertoo;

public interface UserService {


    usertoo findByUsername(String username);
}
