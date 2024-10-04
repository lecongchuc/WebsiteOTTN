package com.hutech.websiteOnThiTracNghiem.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name="CauHoi")
public class CauHoi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MaCauHoi;
    @Column(length = 1000)
    private String NoiDung;
    private Long MaCauTraLoi;

    @OneToMany(mappedBy = "MaDapAn", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<DapAn> DanhSachDapAn;

    @OneToMany(mappedBy = "MaCauHoi", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<CauHoiDeThi> DanhSachCauHoiDeThi;

    @OneToMany(mappedBy = "MaCauHoi", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<CauHoiLuyenThi> DanhSachCauHoiLuyenThi;

    @ManyToOne
    @JoinColumn(name = "MaMucDo")
    private MucDo MaMucDo;

    public Long getMaCauHoi() {
        return MaCauHoi;
    }

    public void setMaCauHoi(Long maCauHoi) {
        MaCauHoi = maCauHoi;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String noiDung) {
        NoiDung = noiDung;
    }

    public Long getMaCauTraLoi() {
        return MaCauTraLoi;
    }

    public void setMaCauTraLoi(Long maCauTraLoi) {
        MaCauTraLoi = maCauTraLoi;
    }

    public Collection<DapAn> getDanhSachDapAn() {
        return DanhSachDapAn;
    }

    public void setDanhSachDapAn(Collection<DapAn> danhSachDapAn) {
        DanhSachDapAn = danhSachDapAn;
    }

    public Collection<CauHoiDeThi> getDanhSachCauHoiDeThi() {
        return DanhSachCauHoiDeThi;
    }

    public void setDanhSachCauHoiDeThi(Collection<CauHoiDeThi> danhSachCauHoiDeThi) {
        DanhSachCauHoiDeThi = danhSachCauHoiDeThi;
    }

    public Collection<CauHoiLuyenThi> getDanhSachCauHoiLuyenThi() {
        return DanhSachCauHoiLuyenThi;
    }

    public void setDanhSachCauHoiLuyenThi(Collection<CauHoiLuyenThi> danhSachCauHoiLuyenThi) {
        DanhSachCauHoiLuyenThi = danhSachCauHoiLuyenThi;
    }

    public MucDo getMaMucDo() {
        return MaMucDo;
    }

    public void setMaMucDo(MucDo maMucDo) {
        MaMucDo = maMucDo;
    }
}
