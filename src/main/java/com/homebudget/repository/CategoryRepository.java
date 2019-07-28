package com.homebudget.repository;

import com.homebudget.common.Constants;
import com.homebudget.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByTypeOrderByName(Constants.Type type);

}
