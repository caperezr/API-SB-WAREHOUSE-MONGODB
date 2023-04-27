package com.cperez.apimongodb.controller;

import com.cperez.apimongodb.dto.WarehouseTypeDTO;
import com.cperez.apimongodb.model.WarehouseType;
import com.cperez.apimongodb.service.WarehouseTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/warehouseTypes")
@Slf4j
public class WarehouseTypeController {
    @Autowired
    private WarehouseTypeService warehouseTypeService;

    @GetMapping("")
    public ResponseEntity<List<WarehouseType>> getWarehouseTypes(){
        try {
            List<WarehouseType> warehouseTypes = warehouseTypeService.getWarehouseTypes();
            return ResponseEntity.status(HttpStatus.OK).body(warehouseTypes);
        }
        catch(Exception ex) {
            log.error(ex.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<WarehouseType> getWarehouseTypesById(@PathVariable String id){
        try {
            WarehouseType warehouseType = warehouseTypeService.getWarehouseTypeById(id);
            return ResponseEntity.status(HttpStatus.OK).body(warehouseType);
        }
        catch(Exception ex) {
            log.error(ex.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

    @PostMapping("")
    @Transactional
    public ResponseEntity<WarehouseType> createWarehouseType(@RequestBody WarehouseTypeDTO warehouseTypeDTO){
        try {
            WarehouseType warehouseType = warehouseTypeService.createWarehouseType(warehouseTypeDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(warehouseType);
        }
        catch(Exception ex) {
            log.error(ex.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }
}
