package com.cperez.apimongodb.repository;

import com.cperez.apimongodb.model.ProductType;
import com.cperez.apimongodb.repository.impl.ProductTypeRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@DataMongoTest
@ExtendWith(MockitoExtension.class)
public class ProductTypeRepositoryTest {
    @Mock
    private MongoTemplate mongoTemplate;

    @InjectMocks
    private ProductTypeRepositoryImpl productTypeRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getProductTypesTest() {

        ProductType productType1 = new ProductType("1", "Product Type 1");
        ProductType productType2 = new ProductType("2", "Product Type 2");
        List<ProductType> expectedProductTypes = Arrays.asList(productType1, productType2);
        when(mongoTemplate.findAll(ProductType.class)).thenReturn(expectedProductTypes);

        List<ProductType> productTypes = productTypeRepository.getProductTypes();

        assertThat(productTypes).isEqualTo(expectedProductTypes);
    }




}
