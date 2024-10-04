package com.hutech.websiteOnThiTracNghiem.entities;

import jakarta.persistence.*;

@Entity
public class DapAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MaDapAn;
    @Column(length = 250)
    private String NoiDung;

    @ManyToOne
    @JoinColumn(name = "MaCauHoi")
    private CauHoi MaCauHoi;

    public Long getMaDapAn() {
        return MaDapAn;
    }

    public void setMaDapAn(Long maDapAn) {
        MaDapAn = maDapAn;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String noiDung) {
        NoiDung = noiDung;
    }

    public CauHoi getMaCauHoi() {
        return MaCauHoi;
    }

    public void setMaCauHoi(CauHoi maCauHoi) {
        MaCauHoi = maCauHoi;
    }


}
