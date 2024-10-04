package com.hutech.websiteOnThiTracNghiem.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Menu {
    @Id
    @Column(length = 20)
    private String MaMenu;
    @Column(length = 250)
    private String TenMenu;
    @Column(length = 250)
    private String Link;

    public String getMaMenu() {
        return MaMenu;
    }

    public void setMaMenu(String maMenu) {
        MaMenu = maMenu;
    }

    public String getTenMenu() {
        return TenMenu;
    }

    public void setTenMenu(String tenMenu) {
        TenMenu = tenMenu;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }


}
