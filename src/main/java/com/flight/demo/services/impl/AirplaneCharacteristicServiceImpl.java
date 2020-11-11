package com.flight.demo.services.impl;

import com.flight.demo.dao.AirplaneCharacteristicsDao;
import com.flight.demo.model.AirplaneCharacteristics;
import com.flight.demo.services.AirplaneCharacteristicService;
import org.springframework.stereotype.Service;

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
    public AirplaneCharacteristics getAirplaneCharacteristicsById(Integer id) {
        return airplaneCharacteristicsDao.findById(id).get();
    }
}
