package com.flight.demo.services;

import com.flight.demo.model.AirplaneCharacteristics;
import com.flight.demo.model.TemporaryPoint;
import com.flight.demo.model.WayPoint;
import java.util.List;

public interface FlightService {
    List<TemporaryPoint> calculate(AirplaneCharacteristics airplaneCharacteristics,
                                   List<WayPoint> wayPoints);
}
