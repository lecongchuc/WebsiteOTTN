package com.hutech.websiteOnThiTracNghiem.repositories;

import com.hutech.websiteOnThiTracNghiem.entities.ChiTietTaiKhoanDeThi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietTaiKhoanDeThiRepository extends JpaRepository<ChiTietTaiKhoanDeThi, Long> {
}
