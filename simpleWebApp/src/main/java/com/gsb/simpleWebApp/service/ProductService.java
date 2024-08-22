package com.gsb.simpleWebApp.service;

import com.gsb.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
      new Product(101, "Iphone", 50000),
      new Product(102, "IQ00", 60000)
    );

    public List<Product> getProducts() {
        return products;
    }

}
