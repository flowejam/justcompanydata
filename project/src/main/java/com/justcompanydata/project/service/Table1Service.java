package com.justcompanydata.project.service;

import org.springframework.stereotype.Service;

import com.justcompanydata.project.repository.Table1Repository;
import com.justcompanydata.project.model.CompanyRecordTable1;

import java.util.List;

@Service
public class Table1Service {
    private Table1Repository repo;

    public List<CompanyRecordTable1> getRecordsForTable1() {
        return repo.findAll();
    }
}
