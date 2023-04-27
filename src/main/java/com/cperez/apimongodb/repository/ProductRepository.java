package com.cperez.apimongodb.repository;

import com.cperez.apimongodb.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProductRepository {
    List<Product> getProducts();
    Product getProductByid(String id);
    Product createProduct(Product product);
}
