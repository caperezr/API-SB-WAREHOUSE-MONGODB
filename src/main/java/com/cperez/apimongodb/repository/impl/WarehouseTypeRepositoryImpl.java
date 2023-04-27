package com.cperez.apimongodb.repository.impl;

import com.cperez.apimongodb.model.WarehouseType;
import com.cperez.apimongodb.repository.WarehouseTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WarehouseTypeRepositoryImpl implements WarehouseTypeRepository {
    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public List<WarehouseType> getWarehouseTypes() {
        return mongoTemplate.findAll(WarehouseType.class);
    }

    @Override
    public WarehouseType getWarehouseTypeById(String id) {
        Query query = new Query();
        Criteria criteria = Criteria.where("id").is(id);
        query.addCriteria(criteria);
        return mongoTemplate.findOne(query, WarehouseType.class);
    }

    @Override
    public WarehouseType createWarehouseType(WarehouseType warehouseType) {
        return mongoTemplate.insert(warehouseType);
    }
}
