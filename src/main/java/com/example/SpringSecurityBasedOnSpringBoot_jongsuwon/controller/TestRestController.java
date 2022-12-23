package com.example.SpringSecurityBasedOnSpringBoot_jongsuwon.controller;

import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class TestRestController {

    @GetMapping("/")
    public String index(HttpServletRequest httpServletRequest){
        HttpSession httpSession = httpServletRequest.getSession();
        return "home";
    }
    @GetMapping("/user")
    public String user(){
        return "user";
    }
    @GetMapping("/admin/pay")
    public String adminPay(){
        return "adminPay";
    }
    @GetMapping("/admin/other")
    public String adminOther(){
        return "adminOther";
    }

}
