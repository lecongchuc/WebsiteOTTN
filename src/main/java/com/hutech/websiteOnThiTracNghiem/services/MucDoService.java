package com.hutech.websiteOnThiTracNghiem.services;

import com.hutech.websiteOnThiTracNghiem.entities.MucDo;
import com.hutech.websiteOnThiTracNghiem.repositories.MucDoRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class MucDoService {
    @Autowired
    private MucDoRepository mucDoRepository;

    public Optional<MucDo> getMucDoById(String id) {
        return mucDoRepository.findById(id);
    }

    public MucDo addMucDo(@Valid MucDo mucDo) {
        return mucDoRepository.save(mucDo);
    }
}
