package com.homebudget.service.impl;

import com.homebudget.common.Constants;
import com.homebudget.converter.CategoryConverter;
import com.homebudget.model.dto.CategoryDto;
import com.homebudget.model.entity.Category;
import com.homebudget.repository.CategoryRepository;
import com.homebudget.service.CategoryService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class CategoryServiceDbImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private CategoryConverter categoryConverter = new CategoryConverter();

    public CategoryServiceDbImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDto> getCategoriesByTypeOrderByName(Constants.Type type) {
        List<Category> categoryEntities = categoryRepository.findByTypeOrderByName(type);
        return categoryConverter.apply(categoryEntities);
    }

}
