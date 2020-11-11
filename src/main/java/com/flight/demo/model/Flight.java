package com.flight.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
    private Long number;
    private List<WayPoint> wayPoints;
    private List<TemporaryPoint> temporaryPoints;
}
