package com.flight.demo.dao;

import com.flight.demo.model.AirplaneCharacteristics;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AirplaneCharacteristicsDao extends MongoRepository<AirplaneCharacteristics,
        Integer> {
}
