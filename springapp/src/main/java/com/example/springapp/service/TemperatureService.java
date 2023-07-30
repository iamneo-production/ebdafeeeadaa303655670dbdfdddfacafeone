package com.example.springapp.service;

import org.springframework.stereotype.Service;

@Service
public class TemperatureService {

    public double convertToCelsius(double temperatureCelsius) {
         return 10;
        //(temperatureCelsius * 5) + 32
    }
}
