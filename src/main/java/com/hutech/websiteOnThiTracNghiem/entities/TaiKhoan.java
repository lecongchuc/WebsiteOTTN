package com.hutech.websiteOnThiTracNghiem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class TaiKhoan {
    @Id
    @Column(length = 50)
    private String UserName;
    @Column(length = 255)
    private String Password;
    private float SoDu;
    @ManyToOne
    @JoinColumn(name = "MaQuyenHan")
    @JsonIgnore
    private QuyenHan MaQuyenHan;

    @OneToMany(mappedBy = "UserName", orphanRemoval = true)
    @JsonIgnore
    private List<TaiKhoanDeThi> DanhSachTaiKhoanDeThi;
}
