package com.cperez.apimongodb.repository;

import com.cperez.apimongodb.model.WarehouseType;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface WarehouseTypeRepository {
    List<WarehouseType> getWarehouseTypes();
    WarehouseType getWarehouseTypeById(String id);

    WarehouseType createWarehouseType(WarehouseType warehouseType);
}
