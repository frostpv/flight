package com.flight.demo.services.impl;

import com.flight.demo.dao.AirplaneCharacteristicsDao;
import com.flight.demo.model.AirplaneCharacteristics;
import com.flight.demo.services.AirplaneCharacteristicService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirplaneCharacteristicServiceImpl implements AirplaneCharacteristicService {
    private final AirplaneCharacteristicsDao airplaneCharacteristicsDao;

    public AirplaneCharacteristicServiceImpl( AirplaneCharacteristicsDao airplaneCharacteristicsDao) {
        this.airplaneCharacteristicsDao = airplaneCharacteristicsDao;
    }


    @Override
    public void addAirplaneCharacteristic(AirplaneCharacteristics airplaneCharacteristics) {
        airplaneCharacteristicsDao.insert(airplaneCharacteristics);
    }

    @Override
    public AirplaneCharacteristics getAirplaneCharacteristicsById(String id) {
        return airplaneCharacteristicsDao.findAll()
                .stream()
                .filter(airplaneCharacteristics -> airplaneCharacteristics.getId().equals(id))
                .findFirst()
                .get();
    }


    @Override
    public List<AirplaneCharacteristics> getAllCharacteristics() {
        return airplaneCharacteristicsDao.findAll();
    }
}
