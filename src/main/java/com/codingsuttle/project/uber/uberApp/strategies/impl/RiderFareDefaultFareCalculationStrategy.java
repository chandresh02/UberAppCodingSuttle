package com.codingsuttle.project.uber.uberApp.strategies.impl;

import com.codingsuttle.project.uber.uberApp.dto.RideRequestDto;
import com.codingsuttle.project.uber.uberApp.strategies.RideFareCalculationStrategy;
import org.springframework.stereotype.Service;

@Service
public class RiderFareDefaultFareCalculationStrategy  implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
