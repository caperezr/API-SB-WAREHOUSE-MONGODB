package com.cperez.apimongodb.repository.impl;

import com.cperez.apimongodb.model.ProductType;
import com.cperez.apimongodb.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProductTypeRepositoryImpl implements ProductTypeRepository {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public List<ProductType> getProductTypes() {
        return mongoTemplate.findAll(ProductType.class);
    }

    @Override
    public ProductType getProductTypeByid(String id) {
        Query query = new Query();
        Criteria criteria = Criteria.where("id").is(id);
        query.addCriteria(criteria);
        return mongoTemplate.findOne(query, ProductType.class);
    }

    @Override
    public ProductType createProductType(ProductType productType) {
        return mongoTemplate.insert(productType);
    }
}
