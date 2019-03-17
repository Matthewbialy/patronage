package com.crud.intive.service;

import com.crud.intive.domain.Database;
import com.crud.intive.repository.DatabaseDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private DatabaseDao databaseDao;

    public List<Database> getAll() {
        return databaseDao.findAll();
    }


}
