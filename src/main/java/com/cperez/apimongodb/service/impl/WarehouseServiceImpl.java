package com.cperez.apimongodb.service.impl;

import com.cperez.apimongodb.dto.WarehouseDTO;
import com.cperez.apimongodb.model.Warehouse;
import com.cperez.apimongodb.repository.WarehouseRepository;
import com.cperez.apimongodb.repository.WarehouseTypeRepository;
import com.cperez.apimongodb.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {
    @Autowired
    private WarehouseRepository warehouseRepository;
    @Autowired
    private WarehouseTypeRepository warehouseTypeRepository;

    @Override
    public List<Warehouse> getWarehouses() {
        return warehouseRepository.getWarehouses();
    }

    @Override
    public Warehouse getWarehouseById(String id) {
        return warehouseRepository.getWarehouseById(id);
    }

    @Override
    public Warehouse createWarehouse(WarehouseDTO warehouseDTO) {
        Warehouse warehouse = new Warehouse(warehouseDTO);
        warehouse.setWarehouseType(warehouseTypeRepository.getWarehouseTypeById(warehouseDTO.getIdWarehouseType()));
        return warehouseRepository.createWarehouse(warehouse);
    }
}
