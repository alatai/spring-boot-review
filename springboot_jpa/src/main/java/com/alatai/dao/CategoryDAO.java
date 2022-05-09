package com.alatai.dao;

import com.alatai.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/05/16 12:12
 */
public interface CategoryDAO extends JpaRepository<Category, Integer> {

}
