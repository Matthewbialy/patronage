package com.crud.intive.repository;

import com.crud.intive.domain.Position;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
@Repository
public interface PositionDao extends CrudRepository<Position, Integer> {

    List<Position> getLastPositions();

    @Override
    Position save(Position position);

}
