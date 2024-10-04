package com.hutech.websiteOnThiTracNghiem.repositories;

import com.hutech.websiteOnThiTracNghiem.entities.CauHoiDeThi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CauHoiDeThiRepository extends JpaRepository<CauHoiDeThi, Long> {
}
