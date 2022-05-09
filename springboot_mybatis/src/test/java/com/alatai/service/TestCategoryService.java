package com.alatai.service;

import com.alatai.Application;
import com.alatai.entity.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/05/16 22:32
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestCategoryService {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void testFindAll() {
        List<Category> categories = categoryService.findAll();

        categories.forEach(System.out::println);
    }
}
