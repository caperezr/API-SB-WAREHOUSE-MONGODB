package com.cperez.apimongodb.service.impl;

import com.cperez.apimongodb.dto.ProductTypeDTO;
import com.cperez.apimongodb.model.Product;
import com.cperez.apimongodb.model.ProductType;
import com.cperez.apimongodb.repository.ProductTypeRepository;
import com.cperez.apimongodb.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Override
    public List<ProductType> getProductTypes() {
        return productTypeRepository.getProductTypes();
    }

    @Override
    public ProductType getProductTypeByid(String id) {
        return productTypeRepository.getProductTypeByid(id);
    }

    @Override
    public ProductType createProductType(ProductTypeDTO productTypeDTO) {
        ProductType productType = new ProductType(productTypeDTO);
        return productTypeRepository.createProductType(productType);
    }
}
