package com.example.springmvc.training;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showMyPage() {
        return "main-menu";
    }

    @RequestMapping("/showHelloNameForm")
    public String showHelloNameForm() {
        return "hello-name-form";
    }

    @RequestMapping("/processHelloNameForm")
    public String processHelloNameForm() {
        return "confirm-hello-name";
    }
}