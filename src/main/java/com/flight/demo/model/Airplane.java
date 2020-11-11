package com.flight.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Airplane {
    private Long id;
    private AirplaneCharacteristics airplaneCharacteristics;
    private TemporaryPoint temporaryPoint;
    List <Flight> flights;
}
