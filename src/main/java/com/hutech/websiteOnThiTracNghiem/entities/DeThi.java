package com.hutech.websiteOnThiTracNghiem.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

import java.util.Collection;

@Entity
@Table(name="DeThi")
public class DeThi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MaDeThi;
    private int SoLuongCauHoi;
    private Float Gia;
    @Column(length = 500)
    private String GhiChu;
    @ManyToOne
    @JoinColumn(name = "MaMonHoc")
    private MonHoc MaMonHoc;

    @OneToMany(mappedBy = "MaDeThi", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<TaiKhoanDeThi> DanhSachTaiKhoanDeThi;
    @OneToMany(mappedBy = "MaDeThi",cascade = CascadeType.ALL,orphanRemoval = true)
    private Collection<CauHoiDeThi> DanhSachCauHoiDeThi;

    @ManyToOne
    @JoinColumn(name = "MaMucDo")
    private MucDo MaMucDo;
    public int getSoLuongCauHoi() {
        return SoLuongCauHoi;
    }

    public void setSoLuongCauHoi(int soLuongCauHoi) {
        SoLuongCauHoi = soLuongCauHoi;
    }

    public Float getGia() {
        return Gia;
    }

    public void setGia(Float gia) {
        Gia = gia;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String ghiChu) {
        GhiChu = ghiChu;
    }

    public MonHoc getMaMonHoc() {
        return MaMonHoc;
    }

    public void setMaMonHoc(MonHoc maMonHoc) {
        MaMonHoc = maMonHoc;
    }

    public Collection<CauHoiDeThi> getDanhSachCauHoiDeThi() {
        return DanhSachCauHoiDeThi;
    }

    public void setDanhSachCauHoiDeThi(Collection<CauHoiDeThi> danhSachCauHoiDeThi) {
        DanhSachCauHoiDeThi = danhSachCauHoiDeThi;
    }

    public Long getMaDeThi() {
        return MaDeThi;
    }

    public void setMaDeThi(Long maDeThi) {
        MaDeThi = maDeThi;
    }

    public Collection<TaiKhoanDeThi> getDanhSachTaiKhoanDeThi() {
        return DanhSachTaiKhoanDeThi;
    }

    public void setDanhSachTaiKhoanDeThi(Collection<TaiKhoanDeThi> danhSachTaiKhoanDeThi) {
        DanhSachTaiKhoanDeThi = danhSachTaiKhoanDeThi;
    }

    public MucDo getMaMucDo() {
        return MaMucDo;
    }

    public void setMaMucDo(MucDo maMucDo) {
        MaMucDo = maMucDo;
    }
}
