package com.hutech.websiteOnThiTracNghiem.entities;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Date;

@Entity
public class TaiKhoanDeThi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MaTaiKhoanDeThi;

    private float KetQua;
    private Date NgayThi;
    @ManyToOne
    @JoinColumn(name = "UserName")
    private TaiKhoan UserName;

    @ManyToOne
    @JoinColumn(name = "MaDeThi")
    private DeThi MaDeThi;

    @OneToMany(mappedBy = "MaTaiKhoanDeThi", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<ChiTietTaiKhoanDeThi> DanhSachChiTiet;

    public Long getMaTaiKhoanDeThi() {
        return MaTaiKhoanDeThi;
    }

    public void setMaTaiKhoanDeThi(Long maTaiKhoanDeThi) {
        MaTaiKhoanDeThi = maTaiKhoanDeThi;
    }

    public float getKetQua() {
        return KetQua;
    }

    public void setKetQua(float ketQua) {
        KetQua = ketQua;
    }

    public Date getNgayThi() {
        return NgayThi;
    }

    public void setNgayThi(Date ngayThi) {
        NgayThi = ngayThi;
    }

    public TaiKhoan getUserName() {
        return UserName;
    }

    public void setUserName(TaiKhoan userName) {
        UserName = userName;
    }

    public DeThi getMaDeThi() {
        return MaDeThi;
    }

    public void setMaDeThi(DeThi maDeThi) {
        MaDeThi = maDeThi;
    }

    public Collection<ChiTietTaiKhoanDeThi> getDanhSachChiTiet() {
        return DanhSachChiTiet;
    }

    public void setDanhSachChiTiet(Collection<ChiTietTaiKhoanDeThi> danhSachChiTiet) {
        DanhSachChiTiet = danhSachChiTiet;
    }
}
