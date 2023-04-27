package com.cperez.apimongodb.repository;


import com.cperez.apimongodb.model.WarehouseXProduct;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarehouseXProductRepository {
    public List<WarehouseXProduct> getWarehouseXProductsByProductId(int id);
    public List<WarehouseXProduct> getWarehouseXProductsByWarehouseId(int id);
    public WarehouseXProduct createWarehouseXProduct(int productId, WarehouseXProduct warehouseXProduct);

}
