
package com.codingsuttle.project.uber.uberApp.controllers;

import com.codingsuttle.project.uber.uberApp.dto.RideRequestDto;
import com.codingsuttle.project.uber.uberApp.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rider")
@RequiredArgsConstructor
public class RiderController {

   private final RiderService riderService;

    @PostMapping("/requestRide")
 public ResponseEntity<RideRequestDto> rideRequest(@RequestBody RideRequestDto rideRequestDto) {

       return ResponseEntity.ok(riderService.requestRide(rideRequestDto));
       //ResponseEntity contain 3 things ::- Body,Status & Header
   }
}

