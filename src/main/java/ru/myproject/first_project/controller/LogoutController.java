package ru.myproject.first_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LogoutController extends AbstractController {
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        return "redirect:/";
    }
}
