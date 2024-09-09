package com.apitt.api.flight_tracker.model;

import java.util.List;

public class FlightInformation {


    public FlightInformation(String icao24, int startTime, int endTime, String callsign, List<Waypoint> path) {
        this.icao24 = icao24;
        this.startTime = startTime;
        this.endTime = endTime;
        this.callsign = callsign;
        this.path = path;
    }

    private String icao24;

    private int startTime;

    private int endTime;

    private String callsign;

    List<Waypoint> path;


    public String getIcao24() {
        return icao24;
    }

    public void setIcao24(String icao24) {
        this.icao24 = icao24;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCalllsign(String calllsign) {
        this.callsign = calllsign;
    }

    public List<Waypoint> getPath() {
        return path;
    }

    public void setPath(List<Waypoint> path) {
        this.path = path;
    }
}
