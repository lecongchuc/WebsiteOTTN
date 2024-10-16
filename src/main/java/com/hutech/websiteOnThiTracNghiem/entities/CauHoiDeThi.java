package com.hutech.websiteOnThiTracNghiem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CauHoiDeThi")
public class CauHoiDeThi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long MaCauHoiDeThi;
    private float DiemSo;
    @ManyToOne
    @JoinColumn(name = "MaCauHoi")
    @JsonIgnore
    private CauHoi MaCauHoi;
    @ManyToOne
    @JoinColumn(name = "MaDeThi")
    @JsonIgnore
    private DeThi MaDeThi;
}
