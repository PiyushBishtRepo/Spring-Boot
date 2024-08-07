package com.boot.core.spring_boot_core_example.components.services;

import org.springframework.stereotype.Component;

@Component
public class OracleLoginService implements LoginService{
    @Override
    public void login() throws InterruptedException {
        System.out.println("Login using Oracle db");
    }

    @Override
    public void logout() {
        System.out.println("Logout using Oracle db");
    }
}
