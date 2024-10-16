package com.hutech.websiteOnThiTracNghiem.services;

import com.hutech.websiteOnThiTracNghiem.entities.DapAn;
import com.hutech.websiteOnThiTracNghiem.repositories.DapAnRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class DapAnService {
    @Autowired
    private DapAnRepository dapAnRepository;

    public DapAn addDapAn(@Valid DapAn dapAn) {
        return dapAnRepository.save(dapAn);
    }
}
