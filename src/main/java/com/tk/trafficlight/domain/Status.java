package com.tk.trafficlight.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Status {

    private TrafficLight trafficLight;
    private Date date;
    private String status;
    private Boolean personalContact;


}
