package com.codingsuttle.project.uber.uberApp.strategies;

import com.codingsuttle.project.uber.uberApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);
}
