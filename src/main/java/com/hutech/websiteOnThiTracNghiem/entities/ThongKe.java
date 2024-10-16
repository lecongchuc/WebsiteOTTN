package com.hutech.websiteOnThiTracNghiem.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ThongKe {
    @Id
    @Column(length = 30)
    private String MaThongKe;
    private int Thang;
    private int Tuan;
    private int Nam;
    private long SoLuongThiThu;
    private long SoLuongTruyCap;
}
