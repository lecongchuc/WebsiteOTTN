package com.hutech.websiteOnThiTracNghiem.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class MucDo {
    @Id
    @Column(length = 20)
    private String MaMucDo;
    @Column(length = 100)
    private String TenMucDo;

    @OneToMany(mappedBy = "MaMucDo", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<LuyenThi> DanhSachLuyenThi;

    @OneToMany(mappedBy = "MaMucDo", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<DeThi> DanhSachDeThi;

    @OneToMany(mappedBy = "MaMucDo", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<CauHoi> DanhSachCauHoi;

    public String getMaMucDo() {
        return MaMucDo;
    }

    public void setMaMucDo(String maMucDo) {
        MaMucDo = maMucDo;
    }

    public String getTenMucDo() {
        return TenMucDo;
    }

    public void setTenMucDo(String tenMucDo) {
        TenMucDo = tenMucDo;
    }

    public Collection<LuyenThi> getDanhSachLuyenThi() {
        return DanhSachLuyenThi;
    }

    public void setDanhSachLuyenThi(Collection<LuyenThi> danhSachLuyenThi) {
        DanhSachLuyenThi = danhSachLuyenThi;
    }

    public Collection<DeThi> getDanhSachDeThi() {
        return DanhSachDeThi;
    }

    public void setDanhSachDeThi(Collection<DeThi> danhSachDeThi) {
        DanhSachDeThi = danhSachDeThi;
    }

    public Collection<CauHoi> getDanhSachCauHoi() {
        return DanhSachCauHoi;
    }

    public void setDanhSachCauHoi(Collection<CauHoi> danhSachCauHoi) {
        DanhSachCauHoi = danhSachCauHoi;
    }
}
