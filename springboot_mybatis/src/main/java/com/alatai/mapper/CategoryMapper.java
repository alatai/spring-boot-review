package com.alatai.mapper;

import com.alatai.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/05/16 21:28
 */
@Mapper
public interface CategoryMapper {

    List<Category> findAll();

    Category findById(Integer id);

    int insert(Category category);

    int update(Category category);

    int delete(Integer id);
}
