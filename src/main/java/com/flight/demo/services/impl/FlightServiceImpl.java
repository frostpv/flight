package com.flight.demo.services.impl;

import com.flight.demo.model.AirplaneCharacteristics;
import com.flight.demo.model.TemporaryPoint;
import com.flight.demo.model.WayPoint;
import com.flight.demo.services.FlightService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {
    @Override
    public List<TemporaryPoint> calculate(AirplaneCharacteristics airplaneCharacteristics,
                                          List<WayPoint> wayPoints) {
        return null;
    }
}
