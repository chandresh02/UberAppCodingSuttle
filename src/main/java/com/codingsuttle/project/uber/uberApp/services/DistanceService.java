package com.codingsuttle.project.uber.uberApp.services;

import org.locationtech.jts.geom.Point;

public interface DistanceService {

    double calculateDistance(Point sec, Point desc);
}
