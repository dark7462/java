package com.dark.ProductManagementApp.Controller;

import com.dark.ProductManagementApp.model.Product;
import com.dark.ProductManagementApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class homeController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String home() {
        return "Hello page";
    }

    @GetMapping("products")
    public List<Product> getProducts() {
        return productService.findAll();
    }
    @GetMapping("product/{name}")
    public List<Product> getProductByName(@PathVariable String name) {
        return productService.findByName(name);
    }
    @PostMapping("product")
    public void addProduct(@RequestBody Product product) {
        productService.saveProduct(product);
    }

}
