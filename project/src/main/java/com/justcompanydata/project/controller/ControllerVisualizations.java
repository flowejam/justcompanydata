package com.justcompanydata.project.controller;

import com.justcompanydata.project.service.ServiceTable1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/visualizations")
public class ControllerVisualizations {

    @Autowired
    private ServiceTable1 tblService;
    
    @GetMapping
    public String getAggregateVisuals() {
        return "visualizations.html";
    }

    @PostMapping
    public String getTickerSymbols(Model model, @RequestParam String tkr) {
        String tkrUpper = tkr.toUpperCase();
        Optional<String> tkrReturned = tblService.findTicker(tkrUpper);

        if (tkrReturned.isPresent()) {
            model.addAttribute("tkrReturned", tkrReturned.get());
        } else {
            model.addAttribute("tkrReturned", "");
        }

        return "visualizations.html";
    }
}
