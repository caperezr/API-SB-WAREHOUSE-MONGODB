package com.cperez.apimongodb.service.impl;

import com.cperez.apimongodb.dto.WarehouseTypeDTO;
import com.cperez.apimongodb.model.WarehouseType;
import com.cperez.apimongodb.repository.WarehouseTypeRepository;
import com.cperez.apimongodb.service.WarehouseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseTypeServiceImpl implements WarehouseTypeService {
    @Autowired
    private WarehouseTypeRepository warehouseTypeRepository;
    @Override
    public List<WarehouseType> getWarehouseTypes() {
        return warehouseTypeRepository.getWarehouseTypes();
    }

    @Override
    public WarehouseType getWarehouseTypeById(String id) {
        return warehouseTypeRepository.getWarehouseTypeById(id);
    }

    @Override
    public WarehouseType createWarehouseType(WarehouseTypeDTO warehouseTypeDTO) {
        WarehouseType warehouseType = new WarehouseType(warehouseTypeDTO);
        return warehouseTypeRepository.createWarehouseType(warehouseType);
    }
}
