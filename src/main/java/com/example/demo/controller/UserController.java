package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/hello")
    @ResponseBody   //json
    public String hello(){
        System.out.println("UserController.hello()!!");
        return "ok";
    }

    @RequestMapping("/thymeleaf")
    public String testThymeleaf(Model model) {
        model.addAttribute("name","thymeleaf测试");
        return "thymeleaf-test";
    }
}
