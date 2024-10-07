package com.hutech.websiteOnThiTracNghiem.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", "XIN CHÀO TRƯỜNG ĐẠI HỌC CÔNG NGHgfytryỆ THÀNH PHỐ HỒ CHÍ MINH!");
        return "index";
    }
}
