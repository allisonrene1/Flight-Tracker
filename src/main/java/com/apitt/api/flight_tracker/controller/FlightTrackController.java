package com.apitt.api.flight_tracker.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightTrackController {

    @GetMapping(value= "/flight/track")
    private String getFlightTrack(@RequestParam String icao24) {

        return icao24;

    }

}
