package com.hutech.websiteOnThiTracNghiem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CauHoiLuyenThi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MaCauHoiLuyenThi;
    @ManyToOne
    @JoinColumn(name = "MaCauHoi")
    @JsonIgnore
    private CauHoi MaCauHoi;
    @ManyToOne
    @JoinColumn(name = "MaLuyenThi")
    @JsonIgnore
    private LuyenThi MaLuyenThi;

}
