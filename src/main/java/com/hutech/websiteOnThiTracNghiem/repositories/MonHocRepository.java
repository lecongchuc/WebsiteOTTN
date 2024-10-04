package com.hutech.websiteOnThiTracNghiem.repositories;

import com.hutech.websiteOnThiTracNghiem.entities.MonHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonHocRepository extends JpaRepository<MonHoc, String> {

}
