package com.justcompanydata.project.controller;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.data.domain.Page;

import com.justcompanydata.project.service.Table1Service;
import com.justcompanydata.project.model.CompanyRecordTable1;

import java.util.List;

@Controller
@RequestMapping("/datatables/table1")
public class ControllerTable1 {
    @Autowired
    private Table1Service tblService;

    @GetMapping("/{pageNumber}")
    public String getPage(Model model, @PathVariable int pageNumber) {
        Page<CompanyRecordTable1> pg = tblService.getPageOfRecords(pageNumber);
        List<CompanyRecordTable1> recordList = pg.getContent();

        model.addAttribute("pageNumber", pageNumber);
        model.addAttribute("numPages", pg.getTotalPages());
        model.addAttribute("numRecords", pg.getTotalElements());
        model.addAttribute("recordList", recordList);
        return "table1.html";
    }

    
}
