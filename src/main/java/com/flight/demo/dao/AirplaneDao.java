package com.flight.demo.dao;

import com.flight.demo.model.Airplane;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AirplaneDao extends MongoRepository<Airplane, Long> {
}
