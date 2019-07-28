package com.homebudget.converter;

import com.homebudget.model.dto.CategoryDto;
import com.homebudget.model.entity.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryConverter {

    public CategoryDto apply(Category category) {
        return CategoryDto.builder()
                            .id(category.getId())
                            .type(category.getType())
                            .name(category.getName())
                            .build();
    }

    public List<CategoryDto> apply(List<Category> categories) {
        List<CategoryDto> categoryDtoList = new ArrayList<>();
        for (Category category : categories) {
            categoryDtoList.add(apply(category));
        }
        return categoryDtoList;
    }

    public Category apply(CategoryDto categoryDto) {
        return  Category.builder()
                            .id(categoryDto.getId())
                            .type(categoryDto.getType())
                            .name(categoryDto.getName())
                            .build();
    }

}
