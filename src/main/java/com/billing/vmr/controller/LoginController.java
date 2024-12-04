package com.billing.vmr.controller;

import com.billing.vmr.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

    private final LoginService loginService;
    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public boolean login(String username, String password){
        return loginService.login(username,password);
    }

    @PostMapping("/signup")
    public String signUp(String username, String password, String confirmPassword){
        return loginService.signup(username, password, confirmPassword);
    }
}
