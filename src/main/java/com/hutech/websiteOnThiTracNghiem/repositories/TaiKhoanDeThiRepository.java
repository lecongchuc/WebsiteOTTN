package com.hutech.websiteOnThiTracNghiem.repositories;

import com.hutech.websiteOnThiTracNghiem.entities.TaiKhoanDeThi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaiKhoanDeThiRepository extends JpaRepository<TaiKhoanDeThi, Long> {
}
