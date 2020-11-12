package com.flight.demo.controller;

import com.flight.demo.model.Airplane;
import com.flight.demo.model.AirplaneCharacteristics;
import com.flight.demo.services.AirplaneCharacteristicService;
import com.flight.demo.services.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/characteristic")
public class AirplaneCharacteristicController {

    @Autowired
    AirplaneCharacteristicService airplaneCharacteristicService;
    @Autowired
    AirplaneService airplaneService;

    @GetMapping
    String test() {
        Airplane airplane = new Airplane();
        airplane.setAirplaneCharacteristics(new AirplaneCharacteristics());
        airplaneService.addAirplane(airplane);
        System.out.println(airplaneService.getAllAirplanes());
        return "characteristic";
    }
}
