package com.crud.intive.repository;

import com.crud.intive.domain.Database;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
@Repository
public interface DatabaseDao extends CrudRepository<Database, Double> {

    @Override
  List<Database> findAll();

}
