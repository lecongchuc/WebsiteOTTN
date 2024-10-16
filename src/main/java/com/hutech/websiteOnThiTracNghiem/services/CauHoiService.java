package com.hutech.websiteOnThiTracNghiem.services;

import com.hutech.websiteOnThiTracNghiem.entities.CauHoi;
import com.hutech.websiteOnThiTracNghiem.repositories.CauHoiRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CauHoiService {
    @Autowired
    private CauHoiRepository cauHoiRepository;

    public CauHoi addCauHoi(@Valid CauHoi cauHoi) {
        return cauHoiRepository.save(cauHoi);
    }

    public CauHoi updateCauHoi(@NotNull CauHoi cauHoi) {
        CauHoi existingCauHoi = cauHoiRepository.findById(cauHoi.getMaCauHoi())
                .orElseThrow(() -> new IllegalStateException("CauHoi with ID " +
                        cauHoi.getMaCauHoi() + " does not exist."));
        existingCauHoi.setMaMucDo(cauHoi.getMaMucDo());
        existingCauHoi.setNoiDung(cauHoi.getNoiDung());
        existingCauHoi.setMaCauTraLoi(cauHoi.getMaCauTraLoi());
        existingCauHoi.setDanhSachDapAn(cauHoi.getDanhSachDapAn());
        return cauHoiRepository.save(existingCauHoi);
    }

    public List<CauHoi> getAllCauHoi() {
        return cauHoiRepository.findAll();
    }

}
