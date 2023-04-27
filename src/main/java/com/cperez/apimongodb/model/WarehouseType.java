package com.cperez.apimongodb.model;

import com.cperez.apimongodb.dto.WarehouseTypeDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WarehouseType {
    @Id
    private String id;
    private String name;

    public WarehouseType(WarehouseTypeDTO warehouseTypeDTO) {
        this.name = warehouseTypeDTO.getName();
    }
}
