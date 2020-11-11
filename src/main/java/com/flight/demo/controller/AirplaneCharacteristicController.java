package com.flight.demo.controller;

import com.flight.demo.model.AirplaneCharacteristics;
import com.flight.demo.services.AirplaneCharacteristicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/characteristic")
public class AirplaneCharacteristicController {

    @Autowired
    AirplaneCharacteristicService airplaneCharacteristicService;

    @GetMapping
    String test() {
        return "characteristic";
    }
}
