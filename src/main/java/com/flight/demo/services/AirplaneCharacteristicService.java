package com.flight.demo.services;

import com.flight.demo.model.AirplaneCharacteristics;

import java.util.List;

public interface AirplaneCharacteristicService {
    void addAirplaneCharacteristic(AirplaneCharacteristics airplaneCharacteristics);

    AirplaneCharacteristics getAirplaneCharacteristicsById(String id);

    List<AirplaneCharacteristics> getAllCharacteristics();
}
