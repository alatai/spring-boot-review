package com.alatai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/05/13 23:56
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) throws Exception {
        model.addAttribute("jrebel", "testJrebel");
        model.addAttribute("nowTime", DateFormat.getDateInstance().format(new Date()));

        throw new Exception("this is a exception");
    }
}
