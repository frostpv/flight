package com.flight.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "airplane_characteristics")
public class AirplaneCharacteristics {
    @Id
    private String id;
    private int maximalSpeed;
    private int acceleration;
    private int verticalSpeed;
    private int courseChangeSpeed;
}
