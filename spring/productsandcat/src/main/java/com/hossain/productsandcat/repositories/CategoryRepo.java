package com.hossain.productsandcat.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hossain.productsandcat.models.CategoryModel;

@Repository
public interface CategoryRepo extends CrudRepository<CategoryModel, Long>{

}
