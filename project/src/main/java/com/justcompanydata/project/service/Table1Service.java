package com.justcompanydata.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.justcompanydata.project.repository.Table1Repository;
import com.justcompanydata.project.model.CompanyRecordTable1;

import java.util.List;

@Service
public class Table1Service {
    @Autowired
    private Table1Repository repo;

    public List<CompanyRecordTable1> getRecordsForTable1() {
        return repo.findAll();
    }

    public Page<CompanyRecordTable1> getPageOfRecords(int pageNumber) {
        int numRecords = 20;
        Pageable pageable = PageRequest.of(pageNumber - 1, numRecords);
        return repo.findAll(pageable);
    }
}
