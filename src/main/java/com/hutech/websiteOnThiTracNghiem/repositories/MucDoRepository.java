package com.hutech.websiteOnThiTracNghiem.repositories;

import com.hutech.websiteOnThiTracNghiem.entities.MucDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MucDoRepository extends JpaRepository<MucDo, String> {
}
