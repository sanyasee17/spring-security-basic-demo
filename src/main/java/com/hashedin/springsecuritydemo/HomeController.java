package com.hashedin.springsecuritydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String welcome() {
        return "Hello, World";
    }

    @GetMapping("/home")
    public String home() {
        return "This is Home Page.";
    }

    @GetMapping("/admin")
    public String admin(){
        return "This is admin Page.";
    }
}
