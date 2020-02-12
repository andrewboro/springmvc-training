package com.example.springmvc.training;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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

    @GetMapping("/showHelloMessageForm")
    public String showHelloMessageForm() {
        return "hello-message-form";
    }

    @GetMapping("/processHelloMessageForm")
    public String processHelloMessageForm(HttpServletRequest request, Model model) {
        StringBuilder sb = new StringBuilder();
        sb.append("We are happy you are with us ");
        sb.append(request.getParameter("studentName"));
        sb.append(" :)");
        model.addAttribute("message", sb.toString());
        return "confirm-hello-message";
    }
}
