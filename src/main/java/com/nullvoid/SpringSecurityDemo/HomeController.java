package com.nullvoid.SpringSecurityDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "This is homepage";
    }

    @GetMapping("/admin")
    public String admin(){
        return "This is admin page";
    }
}
