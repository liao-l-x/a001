package com.example.demo.controller;

import org.apache.shiro.subject.Subject;
import com.example.demo.model.usertoo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
        return "index";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @PostMapping("/login")
    @ResponseBody
    public String login(String username, String password) {
        // 密码MD5加密
        //password = MD5Utils.encrypt(username, password);
        System.out.println(username+password);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 获取Subject对象
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            return "redirect: / ";
        } catch (Exception e) {
            return "333";
        }
    }
    @RequestMapping("/")
    public String redirectIndex() {
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index() {
        System.out.println("index________________________");
        // 登录成后，即可通过Subject获取登录的用户信息
      /*  usertoo user = (usertoo) SecurityUtils.getSubject().getPrincipal();
        model.addAttribute("user", user);*/
        return  "index";
    }
}
