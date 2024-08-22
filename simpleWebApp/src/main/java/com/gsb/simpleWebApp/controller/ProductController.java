package com.gsb.simpleWebApp.controller;

import com.gsb.simpleWebApp.model.Product;
import com.gsb.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @RequestMapping("/products/{prodId}")
    public Product getProductById (@PathVariable int prodId) {
        return productService.getProductById(prodId);
    }

    @PostMapping("products")
    public void addProduct (@RequestBody Product product) {
        System.out.println(product);
        productService.addProduct(product);
    }

    @PutMapping("products")
    public void updateProduct (@RequestBody Product product) {
        productService.updateProduct(product);
    }

    @DeleteMapping("products/{productId}")
    public void deleteProduct (@PathVariable int productId) {
        productService.deleteProduct(productId);
    }

}
