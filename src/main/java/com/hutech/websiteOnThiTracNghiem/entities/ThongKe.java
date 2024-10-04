package com.hutech.websiteOnThiTracNghiem.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

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

    public String getMaThongKe() {
        return MaThongKe;
    }

    public void setMaThongKe(String maThongKe) {
        MaThongKe = maThongKe;
    }

    public int getThang() {
        return Thang;
    }

    public void setThang(int thang) {
        Thang = thang;
    }

    public int getTuan() {
        return Tuan;
    }

    public void setTuan(int tuan) {
        Tuan = tuan;
    }

    public int getNam() {
        return Nam;
    }

    public void setNam(int nam) {
        Nam = nam;
    }

    public long getSoLuongThiThu() {
        return SoLuongThiThu;
    }

    public void setSoLuongThiThu(long soLuongThiThu) {
        SoLuongThiThu = soLuongThiThu;
    }

    public long getSoLuongTruyCap() {
        return SoLuongTruyCap;
    }

    public void setSoLuongTruyCap(long soLuongTruyCap) {
        SoLuongTruyCap = soLuongTruyCap;
    }


}
