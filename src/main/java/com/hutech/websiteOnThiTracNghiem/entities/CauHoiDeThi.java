package com.hutech.websiteOnThiTracNghiem.entities;

import jakarta.persistence.*;

@Entity
@Table(name="CauHoiDeThi")
public class CauHoiDeThi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long MaCauHoiDeThi;
    private float DiemSo;
    @ManyToOne
    @JoinColumn(name = "MaCauHoi")
    private CauHoi MaCauHoi;
    @ManyToOne
    @JoinColumn(name="MaDeThi")
    private DeThi MaDeThi;

    public Long getMaCauHoiDeThi() {
        return MaCauHoiDeThi;
    }

    public void setMaCauHoiDeThi(Long maCauHoiDeThi) {
        MaCauHoiDeThi = maCauHoiDeThi;
    }

    public float getDiemSo() {
        return DiemSo;
    }

    public void setDiemSo(float diemSo) {
        DiemSo = diemSo;
    }

    public CauHoi getMaCauHoi() {
        return MaCauHoi;
    }

    public void setMaCauHoi(CauHoi maCauHoi) {
        MaCauHoi = maCauHoi;
    }

    public DeThi getMaDeThi() {
        return MaDeThi;
    }

    public void setMaDeThi(DeThi maDeThi) {
        MaDeThi = maDeThi;
    }

}
