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
 * @date 2021/05/16 21:45
 */
@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * list page
     */
    @GetMapping("/categories")
    public String list(Model model) {
        List<Category> categories = categoryService.findAll();

        model.addAttribute("categories", categories);

        return "/list";
    }

    /**
     * delete
     */
    @DeleteMapping("/categories/{id}")
    @ResponseBody
    public String delete(@PathVariable("id") Integer id) {
        categoryService.delete(id);

        return "success";
    }

    /**
     * add
     */
    @PostMapping("/categories")
    public String add(Category category) {
        categoryService.insert(category);

        return "redirect:/categories";
    }

    /**
     * edit page
     */
    @GetMapping("/categories/{id}")
    public String edit(Model model, @PathVariable Integer id) {
        Category category = categoryService.findById(id);

        model.addAttribute("category", category);

        return "/edit";
    }

    /**
     * update
     */
    @PatchMapping("/categories/{id}")
    public String update(Category category) {
        categoryService.update(category);

        return "redirect:/categories";
    }


}
