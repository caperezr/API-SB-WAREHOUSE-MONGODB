package com.cperez.apimongodb.service;

import com.cperez.apimongodb.dto.ProductTypeDTO;
import com.cperez.apimongodb.model.ProductType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductTypeService {
    List<ProductType> getProductTypes();
    ProductType getProductTypeByid(String id);
    ProductType createProductType(ProductTypeDTO productTypeDTO);
}
