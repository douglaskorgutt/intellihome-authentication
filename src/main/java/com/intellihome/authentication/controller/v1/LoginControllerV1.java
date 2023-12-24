package com.intellihome.authentication.controller.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginControllerV1 {

    @GetMapping("/login")
    public String login() {
        return "User has successfully logged in!!";
    }
}
