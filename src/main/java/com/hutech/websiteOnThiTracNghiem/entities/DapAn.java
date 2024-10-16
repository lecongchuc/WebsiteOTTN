package com.hutech.websiteOnThiTracNghiem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@Entity
public class DapAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MaDapAn;
    @Column(length = 250)
    private String NoiDung;

    @ManyToOne
    @JoinColumn(name = "MaCauHoi")
    @JsonIgnore
    private CauHoi MaCauHoi;

    public boolean equalValue(DapAn dapAn) {
        if (!Objects.equals(this.MaDapAn, dapAn.MaDapAn)) {
            return false;
        }
        if (!this.NoiDung.equals(dapAn.NoiDung)) {
            return false;
        }
        return true;
    }

}
