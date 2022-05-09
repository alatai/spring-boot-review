package com.alatai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/07/12 22:18
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "thymeleaf");

        return "hello";
    }
}
