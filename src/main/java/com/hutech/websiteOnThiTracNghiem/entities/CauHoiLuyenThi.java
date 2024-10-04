package com.hutech.websiteOnThiTracNghiem.entities;

import jakarta.persistence.*;

@Entity
public class CauHoiLuyenThi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MaCauHoiLuyenThi;
    @ManyToOne
    @JoinColumn(name= "MaCauHoi")
    private CauHoi MaCauHoi;
    @ManyToOne
    @JoinColumn(name = "MaLuyenThi")
    private LuyenThi MaLuyenThi;

    public Long getMaCauHoiLuyenThi() {
        return MaCauHoiLuyenThi;
    }

    public void setMaCauHoiLuyenThi(Long maCauHoiLuyenThi) {
        MaCauHoiLuyenThi = maCauHoiLuyenThi;
    }

    public CauHoi getMaCauHoi() {
        return MaCauHoi;
    }

    public void setMaCauHoi(CauHoi maCauHoi) {
        MaCauHoi = maCauHoi;
    }

    public LuyenThi getMaLuyenThi() {
        return MaLuyenThi;
    }

    public void setMaLuyenThi(LuyenThi maLuyenThi) {
        MaLuyenThi = maLuyenThi;
    }
}
