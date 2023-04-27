package com.cperez.apimongodb.repository;

import com.cperez.apimongodb.model.ProductType;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProductTypeRepository {
    List<ProductType> getProductTypes();
    ProductType getProductTypeByid(String id);
    ProductType createProductType(ProductType productType);
}
