package com.dark.ProductManagementApp.service;

import com.dark.ProductManagementApp.Repository.ProductRepo;
import com.dark.ProductManagementApp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;

    public List<Product> findAll() {
        return repo.findAll();
    }
    public List<Product> findByName(String name) {
        return repo.findByName(name);
    }
    public List<Product> findByType(String name) {
        return repo.findByType(name);
    }
    public void saveProduct(Product product) {
        System.out.println("ProductService.saveProduct");
        if(product != null){
            repo.save(product);
        }
    }

}
