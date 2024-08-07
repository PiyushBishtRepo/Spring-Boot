package com.boot.core.spring_boot_core_example.components.controller;

import com.boot.core.spring_boot_core_example.components.services.LoginService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class HomeController {

    private LoginService loginService;

    public HomeController( LoginService loginService)
    {
        this.loginService=loginService;
    }

    public void loginUser() throws InterruptedException {
        loginService.login();
        System.out.println("logged in success");
    }

    public void logout()
    {
        loginService.logout();
    }
}
