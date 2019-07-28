package com.homebudget.service;


import com.homebudget.common.Constants;
import com.homebudget.model.dto.CategoryDto;

import java.util.List;

public interface CategoryService {

    List<CategoryDto> getCategoriesByTypeOrderByName(Constants.Type type);

}
