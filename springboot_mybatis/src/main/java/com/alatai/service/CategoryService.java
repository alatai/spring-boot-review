package com.alatai.service;

import com.alatai.entity.Category;

import java.util.List;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/05/16 21:43
 */
public interface CategoryService {

    List<Category> findAll();

    Category findById(Integer id);

    int insert(Category category);

    int update(Category category);

    int delete(Integer id);
}
