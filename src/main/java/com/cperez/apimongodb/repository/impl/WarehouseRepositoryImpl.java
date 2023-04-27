package com.cperez.apimongodb.repository.impl;

import com.cperez.apimongodb.model.Warehouse;
import com.cperez.apimongodb.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class WarehouseRepositoryImpl implements WarehouseRepository {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public List<Warehouse> getWarehouses() {
        return mongoTemplate.findAll(Warehouse.class);
    }

    @Override
    public Warehouse getWarehouseById(String id) {
        Query query = new Query();
        Criteria criteria = Criteria.where("id").is(id);
        query.addCriteria(criteria);
        return mongoTemplate.findOne(query, Warehouse.class);
    }

    @Override
    public Warehouse createWarehouse(Warehouse warehouse) {
        return mongoTemplate.insert(warehouse);
    }
}
