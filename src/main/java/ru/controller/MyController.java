package ru.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")

public class MyController {
    @GetMapping("/page1")
    public String getHtml(){
        return "page1";
    }
    @GetMapping("/page2")

    public String get2page(){
        return "page2";
    }
    @GetMapping("/page3")

    public String get3page(){
        return "page3";
    }
}
