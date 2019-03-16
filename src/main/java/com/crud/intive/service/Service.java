package com.crud.intive.service;

import com.crud.intive.domain.Distance;
import com.crud.intive.domain.Velocity;
import com.crud.intive.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Repository repository;

    public List<Velocity> getAll() {
        return repository.findAll();
    }

    public Velocity saveAll(final Velocity velocity) {
        return repository.save(velocity);
    }

    public Distance saveDistance(final Distance distance) {
        return repository.save(distance);
    }
}
