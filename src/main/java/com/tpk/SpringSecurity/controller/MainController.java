package com.tpk.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping("/home")
    public String home() {
      return "home";
    }

    @GetMapping("/user/home")
    public String userHome() {
        return "User";
    }

    @GetMapping("/admin/home")
    public String adminHome() {
        return "Admin";
    }

}

