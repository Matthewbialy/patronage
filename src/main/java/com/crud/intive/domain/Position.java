package com.crud.intive.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamedQuery(name = "Position.getLastPositions", query = "FROM Position order by timestamp desc")
@Entity
@Table(name= "POSITIONS")
public  class Position {

    private int id;
    private double latitude ;
    private double longitude;
    private double timestamp;

    public Position(double latitude, double longitude, double timestamp) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.timestamp = timestamp;
    }

    @Id
    @GeneratedValue
    @NotNull
    public int getId() {
        return id;
    }

    @Column(name = "LATITUDE")
    public double getLatitude() {
        return latitude;
    }

    @Column(name = "LONGITUDE")
    public double getLongitude() {
        return longitude;
    }

    @Column(name = "TIMESTAMP")
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
