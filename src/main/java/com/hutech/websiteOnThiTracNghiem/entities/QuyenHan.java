package com.hutech.websiteOnThiTracNghiem.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class QuyenHan {
    @Id
    @Column(length = 10)
    private String MaQuyenHan;
    @Column(length = 50)
    private String TenQuyenHan;
    @Column(length = 500)
    private String MoTa;

    @OneToMany(mappedBy = "UserName", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<TaiKhoan> DanhSachTaiKhoan;
    public String getMaQuyenHan() {
        return MaQuyenHan;
    }

    public void setMaQuyenHan(String maQuyenHan) {
        MaQuyenHan = maQuyenHan;
    }

    public String getTenQuyenHan() {
        return TenQuyenHan;
    }

    public void setTenQuyenHan(String tenQuyenHan) {
        TenQuyenHan = tenQuyenHan;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public Collection<TaiKhoan> getDanhSachTaiKhoan() {
        return DanhSachTaiKhoan;
    }

    public void setDanhSachTaiKhoan(Collection<TaiKhoan> danhSachTaiKhoan) {
        DanhSachTaiKhoan = danhSachTaiKhoan;
    }


}
