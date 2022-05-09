package com.alatai.springboot_01.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/05/13 22:43
 */
@RestController // Spring 4的新注解，@ResponseBody和@Controller的缩写
public class HelloController {

    // @RequestMapping("/hello")
    // public String hello() {
    //     return "Hello Spring Boot!";
    // }

    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }
}
