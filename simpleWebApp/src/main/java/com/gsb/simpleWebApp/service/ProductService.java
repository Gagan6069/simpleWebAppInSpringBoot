package com.gsb.simpleWebApp.service;

import com.gsb.simpleWebApp.model.Product;
import com.gsb.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//      new Product(101, "Iphone", 50000),
//      new Product(102, "IQ00", 60000)
//    ));

    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public Product getProductById (int prodId) {
        return productRepo.getReferenceById(prodId);
    }

    public void addProduct(Product product) {
        productRepo.save(product);
    }

    public void updateProduct(Product product) {
        productRepo.save(product);

    }

    public void deleteProduct(int productId) {
        productRepo.deleteById(productId);
    }
}
