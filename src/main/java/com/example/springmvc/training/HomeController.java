package com.example.springmvc.training;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

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

    @GetMapping("/showSignUpForm")
    public String showSignUpForm(Model model) {
        model.addAttribute("student", new Student());
        return "sign-up-form";
    }

    @RequestMapping(value="/processSignUpForm", method= RequestMethod.POST)
    public String processSignUpForm(@Valid @ModelAttribute Student student, BindingResult bindingResult) {
        return bindingResult.hasErrors() ? "sign-up-form" : "confirm-sign-up";
    }

}
