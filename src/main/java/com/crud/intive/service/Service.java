package com.crud.intive.service;

import com.crud.intive.domain.Position;
import com.crud.intive.repository.PositionDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private PositionDao positionDao;

    public Position position;


    public double calcVelocity() {
        List<Position> positions = positionDao.getLastPositions();
        double x1= positions.get(0).getLongitude();
        double y1= positions.get(0).getLatitude();
        double x2= positions.get(1).getLongitude();
        double y2= positions.get(1).getLatitude();

        return Math.sqrt(x2 -x1) + (y2 - y1) / position.getTimestamp();
    }

    public double calcDistance() {
        List<Position> positions = positionDao.getLastPositions();
        Position prev = positions.get(0);
        double distance = 0;
        for (int n = 1; n< positions.size(); n++) {
            distance += calcDistanceTwoPoints(prev,positions.get(n));
            prev = positions.get(n);
        }
        return distance;
    }

    private double calcDistanceTwoPoints(Position prev, Position next) {
        List<Position> positions = positionDao.getLastPositions();
        double x1= prev.getLongitude();
        double y1= prev.getLatitude();
        double x2= next.getLongitude();
        double y2= next.getLatitude();

        double distance = 0;
        for (int n = 1; n<positions.size(); n++) {
            distance += calcDistanceTwoPoints(prev, next);
            prev = positions.get(n);
            next = positions.get(n);
        }
        return distance;
    }

}
