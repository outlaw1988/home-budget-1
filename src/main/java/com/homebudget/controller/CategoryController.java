package com.homebudget.controller;

import com.homebudget.common.Constants;
import com.homebudget.model.dto.CategoryDto;
import com.homebudget.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    final
    CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/get-by-type")
    public ResponseEntity<List<CategoryDto>> getCategories(@RequestParam Constants.Type type) {
        return ResponseEntity.ok(
            categoryService.getCategoriesByTypeOrderByName(type)
        );
    }

}
