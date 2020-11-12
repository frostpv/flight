package com.flight.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Airplane {
    @Id
    private String id;
    private Long AirplaneId;
    private AirplaneCharacteristics airplaneCharacteristics;
    private TemporaryPoint temporaryPoint;
    private List <Flight> flights;
}
