package com.hutech.websiteOnThiTracNghiem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "CauHoi")
public class CauHoi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MaCauHoi;
    @Column(length = 1000)
    private String NoiDung;
    private Long MaCauTraLoi;

    @OneToMany(mappedBy = "MaDapAn", orphanRemoval = true)
    @JsonIgnore
    private List<DapAn> DanhSachDapAn;

    @OneToMany(mappedBy = "MaCauHoi", orphanRemoval = true)
    @JsonIgnore
    private List<CauHoiDeThi> DanhSachCauHoiDeThi;

    @OneToMany(mappedBy = "MaCauHoi", orphanRemoval = true)
    @JsonIgnore
    private List<CauHoiLuyenThi> DanhSachCauHoiLuyenThi;

    @ManyToOne
    @JoinColumn(name = "MaMucDo")
    private MucDo MaMucDo;
//    public boolean equalValue(CauHoi cauHoi){
//        if(!this.NoiDung.equals(cauHoi.getNoiDung())){
//            return false;
//        }
//        if(!this.MaCauTraLoi.equals(cauHoi.getMaCauTraLoi())){
//            return false;
//        }
//        if(!this.MaMucDo.equals(cauHoi.getMaMucDo())){
//            return false;
//        }
//
//        if(this.DanhSachDapAn.size() == cauHoi.DanhSachDapAn.size()){
//            DapAn[] lsA =(DapAn[]) DanhSachDapAn.toArray();
//            DapAn[] lsB = (DapAn[]) cauHoi.DanhSachDapAn.toArray();
//            for(int i=0; i<DanhSachDapAn.size(); i++){
//                if(!lsA[i].equalValue(lsB[i])){
//                    return false;
//                }
//            }
//        }
//        else{
//            return false;
//        }
//        return true;
//    }
}
