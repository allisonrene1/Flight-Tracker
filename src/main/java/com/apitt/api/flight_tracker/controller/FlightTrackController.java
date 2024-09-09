package com.apitt.api.flight_tracker.controller;


import com.apitt.api.flight_tracker.model.FlightInformation;
import com.apitt.api.flight_tracker.service.FlightTrackService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightTrackController {

    private final FlightTrackService flightTrackService;

    private FlightTrackController(FlightTrackService flightTrackService) {
        this.flightTrackService = flightTrackService;
    }

    @GetMapping(value= "/flight/track")
    private FlightInformation getFlightTrack(@RequestParam String callsign) {
        return flightTrackService.getFlightInformation(callsign);
    }

}
