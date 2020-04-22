package com.study.controller;

import com.study.pojo.User;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {


    @Autowired
    UserService userService;

    @PostMapping("/login")
    public String login(User user, Model model, HttpSession session){

        if (userService.login(user)==true) {
            session.setAttribute("login",user);
            return "redirect:/main";
        }else {
            model.addAttribute("msg","用户名或密码错误");
            return "index";
        }
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @PostMapping("/register")
    public String register(User user,Model model){
        if(userService.register(user)==true){
        return "index";
        }else {
            model.addAttribute("msg","用户名已存在");
            return "register";
        }
    }




}



