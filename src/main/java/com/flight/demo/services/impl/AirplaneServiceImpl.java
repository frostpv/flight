package com.flight.demo.services.impl;

import com.flight.demo.dao.AirplaneDao;
import com.flight.demo.model.Airplane;
import com.flight.demo.services.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AirplaneServiceImpl  implements AirplaneService {
    private final AirplaneDao airplaneDao;

    public AirplaneServiceImpl(AirplaneDao airplaneDao) {
        this.airplaneDao = airplaneDao;
    }

    @Override
    public void addAirplane(Airplane airplane) {
        airplaneDao.insert(airplane);
    }

    @Override
    public List<Airplane> getAllAirplanes() {
       return airplaneDao.findAll();
    }
}
