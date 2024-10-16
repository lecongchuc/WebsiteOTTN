package com.hutech.websiteOnThiTracNghiem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "MonHoc")
public class MonHoc {
    @Id
    @Column(length = 10)
    private String MaMonHoc;
    @Column(length = 250)
    private String TenMonHoc;

    @OneToMany(mappedBy = "MaMonHoc", orphanRemoval = true)
    @JsonIgnore
    private List<DeThi> DanhSachDeThi;

    @OneToMany(mappedBy = "MaMonHoc", orphanRemoval = true)
    @JsonIgnore
    private List<LuyenThi> DanhSachLuyenThi;
}
