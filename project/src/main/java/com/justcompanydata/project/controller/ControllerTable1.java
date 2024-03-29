package com.justcompanydata.project.controller;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.data.domain.Page;

import com.justcompanydata.project.service.ServiceTable1;
import com.justcompanydata.project.model.CompanyRecordTable1;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/datatables/table1")
public class ControllerTable1 {
    @Autowired
    private ServiceTable1 tblService;

    @GetMapping("/{pageNumber}")
    public String getPage(Model model, @PathVariable int pageNumber) {
        Page<CompanyRecordTable1> pg = tblService.getPageOfRecords(pageNumber);
        List<CompanyRecordTable1> recordList = pg.getContent();
        List<CompanyRecordTable1> recordListNonNull = recordList.stream()
        .filter(x -> x != null)
        .collect(Collectors.toList());

        model.addAttribute("pageNumber", pageNumber);
        model.addAttribute("numPages", pg.getTotalPages());
        model.addAttribute("numRecords", pg.getTotalElements());
        model.addAttribute("recordList", recordListNonNull);
        return "table1.html";
    }

    
}
