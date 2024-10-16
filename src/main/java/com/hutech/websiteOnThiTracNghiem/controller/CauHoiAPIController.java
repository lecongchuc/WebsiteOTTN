package com.hutech.websiteOnThiTracNghiem.controller;

import com.hutech.websiteOnThiTracNghiem.entities.CauHoi;
import com.hutech.websiteOnThiTracNghiem.services.CauHoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CauHoiAPIController {
    @Autowired
    private CauHoiService cauHoiService;

    @GetMapping("/tat-ca-cau-hoi")
    public List<CauHoi> getAllCauHoi() {
        return cauHoiService.getAllCauHoi();
    }
}
