package com.justcompanydata.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.justcompanydata.project.repository.Table1Repository;
import com.justcompanydata.project.model.CompanyRecordTable1;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ServiceTable1 {
    @Autowired
    private Table1Repository repo;

    public List<CompanyRecordTable1> getRecordsForTable1() {
        return repo.findAll();
    }

    public List<String> getTickerSymbols() {
        List<String> allTickers = repo.findAll().stream()
        .map(x -> x.getTicker())
        .filter(x -> x != null)
        .filter(x -> !x.equals(""))
        .collect(Collectors.toList());

        return allTickers;
    }

    public Page<CompanyRecordTable1> getPageOfRecords(int pageNumber) {
        int numRecords = 20;
        Pageable pageable = PageRequest.of(pageNumber - 1, numRecords);
        return repo.findAll(pageable);
    }

    public Optional<String> findTicker(String ticker) {
        if (ticker.equals("")) {
            return Optional.empty();
        }

        List<CompanyRecordTable1> foundList = repo.findByTicker(ticker);
        if (foundList.isEmpty()) {
            return Optional.empty();
        }

        return Optional.ofNullable(foundList.get(0).getTicker());
    }
}
