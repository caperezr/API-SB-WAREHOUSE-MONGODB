package com.cperez.apimongodb.model;

import com.cperez.apimongodb.dto.WarehouseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Warehouse {
    @Id
    private String id;
    private WarehouseType warehouseType;
    private String name;


    public Warehouse(WarehouseDTO warehouseDTO) {
        WarehouseType warehouseType = new WarehouseType();
        warehouseType.setId(warehouseDTO.getIdWarehouseType());
        this.warehouseType = warehouseType;
        this.name = warehouseDTO.getName();
    }
}
