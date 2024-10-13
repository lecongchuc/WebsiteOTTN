package com.hutech.websiteOnThiTracNghiem.entities;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.List;

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
    private List<DapAn> DanhSachDapAn;

    @OneToMany(mappedBy = "MaCauHoi", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CauHoiDeThi> DanhSachCauHoiDeThi;

    @OneToMany(mappedBy = "MaCauHoi", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CauHoiLuyenThi> DanhSachCauHoiLuyenThi;

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

    public List<DapAn> getDanhSachDapAn() {
        return DanhSachDapAn;
    }

    public void setDanhSachDapAn(List<DapAn> danhSachDapAn) {
        DanhSachDapAn = danhSachDapAn;
    }

    public List<CauHoiDeThi> getDanhSachCauHoiDeThi() {
        return DanhSachCauHoiDeThi;
    }

    public void setDanhSachCauHoiDeThi(List<CauHoiDeThi> danhSachCauHoiDeThi) {
        DanhSachCauHoiDeThi = danhSachCauHoiDeThi;
    }

    public List<CauHoiLuyenThi> getDanhSachCauHoiLuyenThi() {
        return DanhSachCauHoiLuyenThi;
    }

    public void setDanhSachCauHoiLuyenThi(List<CauHoiLuyenThi> danhSachCauHoiLuyenThi) {
        DanhSachCauHoiLuyenThi = danhSachCauHoiLuyenThi;
    }

    public MucDo getMaMucDo() {
        return MaMucDo;
    }

    public void setMaMucDo(MucDo maMucDo) {
        MaMucDo = maMucDo;
    }

    public boolean equalValue(CauHoi cauHoi){
        if(!this.NoiDung.equals(cauHoi.getNoiDung())){
            return false;
        }
        if(!this.MaCauTraLoi.equals(cauHoi.getMaCauTraLoi())){
            return false;
        }
        if(!this.MaMucDo.equals(cauHoi.getMaMucDo())){
            return false;
        }

        if(this.DanhSachDapAn.size() == cauHoi.DanhSachDapAn.size()){
            DapAn[] lsA =(DapAn[]) DanhSachDapAn.toArray();
            DapAn[] lsB = (DapAn[]) cauHoi.DanhSachDapAn.toArray();
            for(int i=0; i<DanhSachDapAn.size(); i++){
                if(!lsA[i].equalValue(lsB[i])){
                    return false;
                }
            }
        }
        else{
            return false;
        }
        return true;
    }
}
