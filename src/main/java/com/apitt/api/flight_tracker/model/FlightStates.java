package com.apitt.api.flight_tracker.model;

import java.util.List;

public class FlightStates {

    public FlightStates(int time, List<Object[]> states) {
        this.time = time;
        this.states = states;
    }

    private int time;

    List<Object[]> states;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public List<Object[]> getStates() {
        return states;
    }

    public void setStates(List<Object[]> states) {
        this.states = states;
    }
}
