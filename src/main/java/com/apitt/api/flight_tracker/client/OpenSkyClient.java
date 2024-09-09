package com.apitt.api.flight_tracker.client;

import com.apitt.api.flight_tracker.model.FlightInformation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Component
public class OpenSkyClient {


    private RestController restController;

    RestTemplate restTemplate = new RestTemplate();
    String allFlightStateURL
            = "https://opensky-network.org/api/states/all";
    ResponseEntity<FlightInformation> response
            = restTemplate.getForEntity(allFlightStateURL, FlightInformation.class);


}
