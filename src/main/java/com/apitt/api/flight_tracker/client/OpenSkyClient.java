package com.apitt.api.flight_tracker.client;

import com.apitt.api.flight_tracker.model.FlightInformation;
import com.apitt.api.flight_tracker.model.FlightStates;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class OpenSkyClient {
    RestTemplate restTemplate = new RestTemplate();
    String allFlightStateURL
            = "https://opensky-network.org/api/states/all";
    String allFlightTrackURL = "https://opensky-network.org/api/tracks/all";

    public FlightStates getFlightStates() {
        return restTemplate.getForObject(allFlightStateURL, FlightStates.class);
    }

    public FlightInformation getFlightInformation(String icao24) {

        String url = UriComponentsBuilder.fromUriString(allFlightTrackURL)
                .queryParam("icao24", icao24)
                .queryParam("time", 0).build().toUriString();

        return restTemplate.getForObject(url, FlightInformation.class);
    }

}
