package com.hossain.productsandcat.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hossain.productsandcat.models.ProductModel;

@Repository
public interface ProductsRepo extends CrudRepository<ProductModel, Long>{

}
