package com.cperez.apimongodb.repository;


import com.cperez.apimongodb.model.Warehouse;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface WarehouseRepository {
    List<Warehouse> getWarehouses();
    Warehouse getWarehouseById(String id);
    Warehouse createWarehouse(Warehouse warehouse);
}
