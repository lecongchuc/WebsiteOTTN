package com.hutech.websiteOnThiTracNghiem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "DeThi")
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
    @JsonIgnore
    private MonHoc MaMonHoc;
    @OneToMany(mappedBy = "MaDeThi", orphanRemoval = true)
    @JsonIgnore
    private List<TaiKhoanDeThi> DanhSachTaiKhoanDeThi;
    @OneToMany(mappedBy = "MaDeThi", orphanRemoval = true)
    @JsonIgnore
    private List<CauHoiDeThi> DanhSachCauHoiDeThi;
    @ManyToOne
    @JoinColumn(name = "MaMucDo")
    @JsonIgnore
    private MucDo MaMucDo;
}
