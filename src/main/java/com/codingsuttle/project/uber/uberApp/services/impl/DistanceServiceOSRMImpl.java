package com.codingsuttle.project.uber.uberApp.services.impl;

import com.codingsuttle.project.uber.uberApp.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {
    @Override
    public double calculateDistance(Point sec, Point desc) {
        return 0;
    }
}
