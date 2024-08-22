package com.gsb.simpleWebApp.service;

import com.gsb.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
      new Product(101, "Iphone", 50000),
      new Product(102, "IQ00", 60000)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById (int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().get();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index = 0;
        for (int i = 0; i < products.size(); i++)
            if (products.get(i).getProdId() == product.getProdId())
                index = i;

        products.set(index, product);

    }

    public void deleteProduct(int productId) {

        int index = 0;
        for (int i = 0; i < products.size(); i++)
            if (products.get(i).getProdId() == productId)
                index = i;

        products.remove(index);

    }
}
