package com.alatai.controller;

import com.alatai.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/07/13 11:53
 */
@Controller
public class TestController {

    @GetMapping("/admin/test")
    public String test(Model model) {
        String htmlContent = "<p style=\"color:red\">红色文字</p>";
        Product currentProduct = new Product(5, "product e", 200);

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "product a", 50));
        products.add(new Product(2, "product b", 100));
        products.add(new Product(3, "product c", 150));
        products.add(new Product(4, "product d", 200));
        products.add(currentProduct);
        products.add(new Product(6, "product f", 250));
        products.add(new Product(7, "product g", 300));

        model.addAttribute("htmlContent", htmlContent);
        model.addAttribute("currentProduct", currentProduct);
        model.addAttribute("testBoolean", true);
        model.addAttribute("products", products);

        return "test/index";
    }
}
