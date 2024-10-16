package com.hutech.websiteOnThiTracNghiem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class LuyenThi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MaLuyenThi;
    private int SoLuongCauHoi;

    @ManyToOne
    @JoinColumn(name = "MaMonHoc")
    @JsonIgnore
    private MonHoc MaMonHoc;
    @ManyToOne
    @JoinColumn(name = "MaMucDo")
    @JsonIgnore
    private MucDo MaMucDo;
    @OneToMany(mappedBy = "MaLuyenThi", orphanRemoval = true)
    @JsonIgnore
    private List<CauHoiLuyenThi> DanhSachCauHoiLuyenThi;
}
