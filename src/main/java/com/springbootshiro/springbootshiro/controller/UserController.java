package com.springbootshiro.springbootshiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "ok";
    }

    /**
     * 测试thymeleaf
     */
    @RequestMapping("/testThymeleaf")
    public String testThymeleaf(Model model){
        //
        model.addAttribute("name","张三");
        return "test";
    }

    @RequestMapping("/add")
    public String add(){
        //
        return "/user/add";
    }

    @RequestMapping("/update")
    public String update(){
        //
        return "/user/update";
    }

    @RequestMapping("/login")
    public String login(){
        //
        return "login";
    }
}
