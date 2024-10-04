package com.hutech.websiteOnThiTracNghiem.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class LuyenThi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MaLuyenThi;

    private int SoLuongCauHoi;
    @ManyToOne
    @JoinColumn(name = "MaMonHoc")
    private MonHoc MaMonHoc;

    @ManyToOne
    @JoinColumn(name = "MaMucDo")
    private MucDo MaMucDo;
    @OneToMany(mappedBy = "MaLuyenThi", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<CauHoiLuyenThi> DanhSachCauHoiLuyenThi;

    public Long getMaLuyenThi() {
        return MaLuyenThi;
    }

    public void setMaLuyenThi(Long maLuyenThi) {
        MaLuyenThi = maLuyenThi;
    }

    public int getSoLuongCauHoi() {
        return SoLuongCauHoi;
    }

    public void setSoLuongCauHoi(int soLuongCauHoi) {
        SoLuongCauHoi = soLuongCauHoi;
    }

    public MonHoc getMaMonHoc() {
        return MaMonHoc;
    }

    public void setMaMonHoc(MonHoc maMonHoc) {
        MaMonHoc = maMonHoc;
    }

    public MucDo getMaMucDo() {
        return MaMucDo;
    }

    public void setMaMucDo(MucDo maMucDo) {
        MaMucDo = maMucDo;
    }

    public Collection<CauHoiLuyenThi> getDanhSachCauHoiLuyenThi() {
        return DanhSachCauHoiLuyenThi;
    }

    public void setDanhSachCauHoiLuyenThi(Collection<CauHoiLuyenThi> danhSachCauHoiLuyenThi) {
        DanhSachCauHoiLuyenThi = danhSachCauHoiLuyenThi;
    }
}
