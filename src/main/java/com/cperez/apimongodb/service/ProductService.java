package com.cperez.apimongodb.service;

import com.cperez.apimongodb.dto.ProductDTO;
import com.cperez.apimongodb.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> getProducts();
    Product getProductByid(String id);
    Product createProduct(ProductDTO productDTO);
}
