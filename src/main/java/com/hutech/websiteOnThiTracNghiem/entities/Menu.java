package com.hutech.websiteOnThiTracNghiem.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Menu {
    @Id
    @Column(length = 20)
    private String MaMenu;
    @Column(length = 250)
    private String TenMenu;
    @Column(length = 250)
    private String Link;

}
