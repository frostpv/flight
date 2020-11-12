package com.flight.demo.services;

import com.flight.demo.model.Airplane;

import java.util.List;


public interface AirplaneService {
    void addAirplane(Airplane airplane);
    List<Airplane> getAllAirplanes();
}
