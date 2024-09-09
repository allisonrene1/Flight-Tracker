package com.apitt.api.flight_tracker;

import com.apitt.api.flight_tracker.client.OpenSkyClient;
import com.apitt.api.flight_tracker.model.FlightInformation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FlightTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightTrackerApplication.class, args);
	}

}
