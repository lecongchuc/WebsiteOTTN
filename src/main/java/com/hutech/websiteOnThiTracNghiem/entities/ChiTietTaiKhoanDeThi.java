package com.hutech.websiteOnThiTracNghiem.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class ChiTietTaiKhoanDeThi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MaChiTiet;
    private long MaDapAnNguoiDung;

    @ManyToOne
    @JoinColumn(name = "MaTaiKhoanDeThi")
    private TaiKhoanDeThi MaTaiKhoanDeThi;

    public Long getMaChiTiet() {
        return MaChiTiet;
    }

    public void setMaChiTiet(Long maChiTiet) {
        MaChiTiet = maChiTiet;
    }

    public long getMaDapAnNguoiDung() {
        return MaDapAnNguoiDung;
    }

    public void setMaDapAnNguoiDung(long maDapAnNguoiDung) {
        MaDapAnNguoiDung = maDapAnNguoiDung;
    }

    public TaiKhoanDeThi getMaTaiKhoanDeThi() {
        return MaTaiKhoanDeThi;
    }

    public void setMaTaiKhoanDeThi(TaiKhoanDeThi maTaiKhoanDeThi) {
        MaTaiKhoanDeThi = maTaiKhoanDeThi;
    }
}
