package com.hutech.websiteOnThiTracNghiem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class TaiKhoanDeThi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MaTaiKhoanDeThi;

    private float KetQua;
    private Date NgayThi;
    @ManyToOne
    @JoinColumn(name = "UserName")
    @JsonIgnore
    private TaiKhoan UserName;

    @ManyToOne
    @JoinColumn(name = "MaDeThi")
    @JsonIgnore
    private DeThi MaDeThi;

    @OneToMany(mappedBy = "MaTaiKhoanDeThi", orphanRemoval = true)
    @JsonIgnore
    private List<ChiTietTaiKhoanDeThi> DanhSachChiTiet;
}
