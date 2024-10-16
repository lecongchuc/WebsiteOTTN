package com.hutech.websiteOnThiTracNghiem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class MucDo {
    @Id
    @Column(length = 20)
    private String MaMucDo;
    @Column(length = 100)
    private String TenMucDo;

    @OneToMany(mappedBy = "MaMucDo", orphanRemoval = true)
    @JsonIgnore
    private List<LuyenThi> DanhSachLuyenThi;

    @OneToMany(mappedBy = "MaMucDo", orphanRemoval = true)
    @JsonIgnore
    private List<DeThi> DanhSachDeThi;

    @OneToMany(mappedBy = "MaMucDo", orphanRemoval = true)
    @JsonIgnore
    private List<CauHoi> DanhSachCauHoi;

}
