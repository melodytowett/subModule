package com.example.subModule;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Modules {
    @GetMapping("/")
    public String myHome(){
        return "Hello sub modules";
    }

}
