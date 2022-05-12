package com.xlukog.reporterserver.controller;

import com.xlukog.reporterserver.model.Report;
import com.xlukog.reporterserver.model.ReportDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReportController {
    @Autowired
    private ReportDao reportDao;
    @GetMapping("/view/all-reports")
    public List<Report> GetAllReport(){
        return reportDao.GetAllReport();

    }
    @PostMapping("/report/save-report")
    public void save(@RequestBody Report report){
        reportDao.save(report);
    }
}
