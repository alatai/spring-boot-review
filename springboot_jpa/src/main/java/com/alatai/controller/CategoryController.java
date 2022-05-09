package com.alatai.controller;

import com.alatai.entity.Category;
import com.alatai.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/05/16 12:36
 */
@Controller
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String list(Model model) {
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories", categories);

        return "/list";
    }

    @ResponseBody
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Integer id) {
        Category category = categoryService.findById(id);
        categoryService.delete(category);

        return "success";
    }

    @GetMapping("/{id}")
    public String edit(Model model, @PathVariable("id") Integer id) {
        Category category = categoryService.findById(id);

        model.addAttribute("category", category);

        return "/edit";
    }

    @PostMapping()
    public String add(Category category) {
        categoryService.save(category);

        return "redirect:/categories";
    }

    @ResponseBody
    @PutMapping
    public String update(Category category) {
        categoryService.update(category);

        return "success";
    }

    @ResponseBody
    @PatchMapping("/test")
    public String test(Category category) {
        System.out.println(category);

        return "success";
    }

}
