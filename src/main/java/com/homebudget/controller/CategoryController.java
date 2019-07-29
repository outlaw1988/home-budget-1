package com.homebudget.controller;

import com.homebudget.common.Constants;
import com.homebudget.model.dto.CategoryDto;
import com.homebudget.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
@CrossOrigin(origins = "http://localhost:4200")
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
