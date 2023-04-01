package com.justcompanydata.project.repository;

import com.justcompanydata.project.model.CompanyRecordTable1;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Table1Repository extends JpaRepository<CompanyRecordTable1, String> {
    List<CompanyRecordTable1> findByTicker(String ticker);
}
