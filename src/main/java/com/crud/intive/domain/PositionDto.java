package com.crud.intive.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class PositionDto {

    private int id;
    private double latitude ;
    private double longitude;
    private double timestamp;

    public PositionDto(int id, double latitude, double longitude, double timestamp) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getTimestamp() {
        return timestamp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setTimestamp(double timestamp) {
        this.timestamp = timestamp;
    }
}
