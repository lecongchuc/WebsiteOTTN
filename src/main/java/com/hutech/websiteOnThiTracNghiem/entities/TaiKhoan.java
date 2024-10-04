package com.hutech.websiteOnThiTracNghiem.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class TaiKhoan {
    @Id
    @Column(length = 50)
    private String UserName;
    @Column(length = 255)
    private String Password;
    private float SoDu;
    @ManyToOne
    @JoinColumn(name = "MaQuyenHan")
    private QuyenHan MaQuyenHan;

    @OneToMany(mappedBy = "UserName", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<TaiKhoanDeThi> DanhSachTaiKhoanDeThi;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public float getSoDu() {
        return SoDu;
    }

    public void setSoDu(float soDu) {
        SoDu = soDu;
    }

    public QuyenHan getMaQuyenHan() {
        return MaQuyenHan;
    }

    public void setMaQuyenHan(QuyenHan maQuyenHan) {
        MaQuyenHan = maQuyenHan;
    }

    public Collection<TaiKhoanDeThi> getDanhSachTaiKhoanDeThi() {
        return DanhSachTaiKhoanDeThi;
    }

    public void setDanhSachTaiKhoanDeThi(Collection<TaiKhoanDeThi> danhSachTaiKhoanDeThi) {
        DanhSachTaiKhoanDeThi = danhSachTaiKhoanDeThi;
    }
}
