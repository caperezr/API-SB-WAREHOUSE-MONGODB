package com.cperez.apimongodb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {
    private String idProductType;
    private String name;
    private String sku;
    private String partNumber;
    private double cost;
    private ArrayList<WarehouseXProductDTO> warehousesDTO;

}
