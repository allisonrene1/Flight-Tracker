package com.apitt.api.flight_tracker.model;

public class Waypoint {

    public Waypoint(int time, float latitude, float longitude, float baroAltitude, float trueTrack, boolean onGround) {
        this.time = time;
        this.latitude = latitude;
        this.longitude = longitude;
        this.baroAltitude = baroAltitude;
        this.trueTrack = trueTrack;
        this.onGround = onGround;
    }

    private int time;

   private float latitude;

   private float longitude;

   private float baroAltitude;

   private float trueTrack;

   private boolean onGround;


    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getBaroAltitude() {
        return baroAltitude;
    }

    public void setBaroAltitude(float baroAltitude) {
        this.baroAltitude = baroAltitude;
    }

    public float getTrueTrack() {
        return trueTrack;
    }

    public void setTrueTrack(float trueTrack) {
        this.trueTrack = trueTrack;
    }

    public boolean isOnGround() {
        return onGround;
    }

    public void setOnGround(boolean onGround) {
        this.onGround = onGround;
    }
}
