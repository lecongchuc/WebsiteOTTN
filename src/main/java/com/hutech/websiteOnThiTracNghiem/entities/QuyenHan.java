package com.hutech.websiteOnThiTracNghiem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class QuyenHan {
    @Id
    @Column(length = 10)
    private String MaQuyenHan;
    @Column(length = 50)
    private String TenQuyenHan;
    @Column(length = 500)
    private String MoTa;

    @OneToMany(mappedBy = "UserName", orphanRemoval = true)
    @JsonIgnore
    private List<TaiKhoan> DanhSachTaiKhoan;
}
