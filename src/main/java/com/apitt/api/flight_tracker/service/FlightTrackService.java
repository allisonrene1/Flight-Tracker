package com.apitt.api.flight_tracker.service;


import com.apitt.api.flight_tracker.client.OpenSkyClient;
import com.apitt.api.flight_tracker.model.FlightInformation;
import com.apitt.api.flight_tracker.model.FlightStates;
import org.springframework.stereotype.Service;

@Service
public class FlightTrackService {
    private final OpenSkyClient openSkyClient;

    public FlightTrackService(OpenSkyClient openSkyClient) {
        this.openSkyClient = openSkyClient;
    }

    public FlightInformation getFlightInformation(String callsign) {

        // call opensky to get all flights (states)
        FlightStates flightStates = openSkyClient.getFlightStates();

        // find active flight with callsign
        Object[] foundState = null;
        for(Object[] state : flightStates.getStates()) {
            String stateCallsign = ((String) state[1]).trim();

            if (stateCallsign.equals(callsign)) {
                foundState = state;
                break;
            }
        }

        if (foundState == null) {
            throw new RuntimeException("could not find flight");
        }

        // get icao24 number from active flight for callsign
        String icao24 = (String) foundState[0];

        // invoke openSky track endpoint with icao24 number
        FlightInformation flightInformation = openSkyClient.getFlightInformation(icao24);
        // return result to controller
        return flightInformation;
    }


}
