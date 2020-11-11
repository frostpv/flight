package com.flight.demo.services;

import com.flight.demo.model.AirplaneCharacteristics;

public interface AirplaneCharacteristicService {

    void addAirplaneCharacteristic(AirplaneCharacteristics airplaneCharacteristics);
    AirplaneCharacteristics getAirplaneCharacteristicsById(Integer id);
}
