package com.cperez.apimongodb.model;

import com.cperez.apimongodb.dto.WarehouseXProductDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WarehouseXProduct {

    private Warehouse warehouse;
    private int stock;

    public WarehouseXProduct(WarehouseXProductDTO warehouseXProductDTO) {
        Warehouse warehouse = new Warehouse();
        warehouse.setId(warehouseXProductDTO.getIdWarehouse());
        this.warehouse = warehouse;
        this.stock = warehouseXProductDTO.getStock();
    }

}
