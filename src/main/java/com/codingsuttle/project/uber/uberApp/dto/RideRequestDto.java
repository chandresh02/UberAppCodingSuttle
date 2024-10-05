package com.codingsuttle.project.uber.uberApp.dto;

import com.codingsuttle.project.uber.uberApp.entities.Rider;
import com.codingsuttle.project.uber.uberApp.enums.PaymentMethod;
import com.codingsuttle.project.uber.uberApp.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.geo.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDto {


    private Long id;
    private PointDto pickupLocation;
    private PointDto dropOffLocation;
    private LocalDateTime requestedTime;
    private Rider rider;
    private PaymentMethod paymentMethod;
    private RideRequestStatus rideRequestStatus;
}
