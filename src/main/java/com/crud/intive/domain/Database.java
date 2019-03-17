package com.crud.intive.domain;


import org.springframework.scheduling.annotation.Scheduled;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name= "DATABASE")
public  class Database {

    private double latitude ;
    private double longitude;
    private double timestamp;
    private double velocity;
    private double distance;


    @Scheduled(fixedRate = 5000)
    public List scheduleTask() {
        return new ArrayList();

    }
    @Column(name = "DISTANCE")
    public void distanceValue() {
        double x = longitude - latitude;
        double y = latitude - longitude;
        double a = Math.pow(x, y);
        double distance = Math.sqrt(a);
        System.out.println(distance);
    }

    @Column(name = "VELOCITY")
    public void velocityValue() {
        double velocity = distance / timestamp;
        System.out.println(velocity);
    }

    public Database(double latitude, double longitude, double timestamp, double velocity, double distance) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.timestamp = timestamp;
        this.velocity = velocity;
        this.distance = distance;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "LATITUDE")
    public double getLatitude() {
        return latitude;
    }

    @Column(name = "LONGITUDE")
    public double getLongitude() {
        return longitude;
    }

    public double getTimestamp() {
        return timestamp;
    }
    public double getVelocity() {
        return velocity;
    }
    public double getDistance() {
        return distance;
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
    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }
}
