package com.flight.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemporaryPoint {
    private Double latitude;
    private Double Longitude;
    private int altitude;
    private int speed;
    private int direction;
}
