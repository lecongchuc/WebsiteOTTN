package com.hutech.websiteOnThiTracNghiem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ChiTietTaiKhoanDeThi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MaChiTiet;
    private long MaDapAnNguoiDung;

    @ManyToOne
    @JoinColumn(name = "MaTaiKhoanDeThi")
    @JsonIgnore
    private TaiKhoanDeThi MaTaiKhoanDeThi;

}
