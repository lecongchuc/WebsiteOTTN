package com.hutech.websiteOnThiTracNghiem.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

import java.util.Collection;

@Entity
@Table(name = "MonHoc")
public class MonHoc {
    @Id
    @Column(length = 10)
    private String MaMonHoc;
    @Column(length = 250)
    private String TenMonHoc;
    @OneToMany(mappedBy = "MaMonHoc", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<DeThi> DanhSachDeThi;

    @OneToMany(mappedBy = "MaMonHoc", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<LuyenThi> DanhSachLuyenThi;
    public String getMaMonHoc() {
        return MaMonHoc;
    }

    public Collection<DeThi> getDanhSachDeThi() {
        return DanhSachDeThi;
    }

    public void setDanhSachDeThi(Collection<DeThi> danhSachDeThi) {
        DanhSachDeThi = danhSachDeThi;
    }

    public void setMaMonHoc(String maMonHoc) {
        MaMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return TenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        TenMonHoc = tenMonHoc;
    }

    public Collection<LuyenThi> getDanhSachLuyenThi() {
        return DanhSachLuyenThi;
    }

    public void setDanhSachLuyenThi(Collection<LuyenThi> danhSachLuyenThi) {
        DanhSachLuyenThi = danhSachLuyenThi;
    }
}
