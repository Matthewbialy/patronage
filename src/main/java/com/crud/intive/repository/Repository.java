package com.crud.intive.repository;

import com.crud.intive.domain.Distance;
import com.crud.intive.domain.Velocity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Repository extends CrudRepository<Velocity, Long> {
    @Override
    List<Velocity> findAll();

    @Override
    Velocity save(Velocity velocity);

    Distance save(Distance distance);
}
