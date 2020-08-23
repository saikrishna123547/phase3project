package com.demo.maindao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.main.Category;

public interface CategoryDao extends JpaRepository<Category,Long> {

}
