package com.cperez.apimongodb.service.impl;

import com.cperez.apimongodb.dto.ProductDTO;
import com.cperez.apimongodb.dto.WarehouseXProductDTO;
import com.cperez.apimongodb.model.Product;
import com.cperez.apimongodb.model.WarehouseXProduct;
import com.cperez.apimongodb.repository.ProductRepository;
import com.cperez.apimongodb.repository.ProductTypeRepository;
import com.cperez.apimongodb.repository.WarehouseRepository;
import com.cperez.apimongodb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductTypeRepository productTypeRepository;
    @Autowired
    private WarehouseRepository warehouseRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.getProducts();
    }

    @Override
    public Product getProductByid(String id) {
        return productRepository.getProductByid(id);
    }

    @Override
    public Product createProduct(ProductDTO productDTO) {
        List<WarehouseXProduct> warehouseXProducts = new ArrayList<>();
        for (WarehouseXProductDTO warehouseXProduct : productDTO.getWarehousesDTO()) {
            WarehouseXProduct warehouseXProduct1 = new WarehouseXProduct(warehouseXProduct);
            warehouseXProduct1.setWarehouse(warehouseRepository.getWarehouseById(warehouseXProduct.getIdWarehouse()));
            warehouseXProducts.add(warehouseXProduct1);
        }
        Product product = new Product(productDTO, warehouseXProducts);
        product.setProductType(productTypeRepository.getProductTypeByid(productDTO.getIdProductType()));

        return productRepository.createProduct(product);
    }
}
