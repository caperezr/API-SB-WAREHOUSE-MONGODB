package com.cperez.apimongodb.service;

import com.cperez.apimongodb.dto.WarehouseDTO;
import com.cperez.apimongodb.model.Warehouse;

import java.util.List;

public interface WarehouseService {
    List<Warehouse> getWarehouses();
    Warehouse getWarehouseById(String id);
    Warehouse createWarehouse(WarehouseDTO warehouseDTO);


}
