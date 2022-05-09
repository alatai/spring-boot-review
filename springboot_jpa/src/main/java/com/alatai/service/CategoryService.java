package com.alatai.service;

import com.alatai.entity.Category;

import java.util.List;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/05/16 14:40
 */
public interface CategoryService {

    List<Category> findAll();

    Category findById(Integer id);

    void save(Category category);

    void update(Category category);

    void delete(Category category);
}
