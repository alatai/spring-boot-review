package com.alatai.service.impl;

import com.alatai.dao.CategoryDAO;
import com.alatai.entity.Category;
import com.alatai.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/05/16 14:40
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;

    @Override
    public List<Category> findAll() {
        return categoryDAO.findAll();
    }

    @Override
    public Category findById(Integer id) {
        return categoryDAO.getOne(id);
    }

    @Override
    public void save(Category category) {
        categoryDAO.save(category);
    }

    @Override
    public void update(Category category) {
        categoryDAO.save(category);
    }

    @Override
    public void delete(Category category) {
        categoryDAO.delete(category);
    }
}
