package com.cperez.apimongodb.model;

import com.cperez.apimongodb.dto.ProductTypeDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductType {
    @Id
    private String id;
    private String name;
    public ProductType(ProductTypeDTO productTypeDTO) {
        this.name = productTypeDTO.getName();
    }

}
