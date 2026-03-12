package com.dark.ProductManagementApp.Repository;

import com.dark.ProductManagementApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    List<Product> findByName(String name);

    List<Product> findByType(String name);

}