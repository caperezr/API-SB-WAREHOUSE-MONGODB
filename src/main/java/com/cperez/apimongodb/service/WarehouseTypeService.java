package com.cperez.apimongodb.service;

import com.cperez.apimongodb.dto.WarehouseTypeDTO;
import com.cperez.apimongodb.model.WarehouseType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WarehouseTypeService {
    List<WarehouseType> getWarehouseTypes();
    WarehouseType getWarehouseTypeById(String id);
    WarehouseType createWarehouseType(WarehouseTypeDTO warehouseTypeDTO);
}
