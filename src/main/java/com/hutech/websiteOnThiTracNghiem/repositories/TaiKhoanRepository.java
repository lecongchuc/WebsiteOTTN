package com.hutech.websiteOnThiTracNghiem.repositories;

import com.hutech.websiteOnThiTracNghiem.entities.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaiKhoanRepository extends JpaRepository<TaiKhoan, String> {
}
