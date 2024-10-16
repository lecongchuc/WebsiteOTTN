package com.hutech.websiteOnThiTracNghiem.controller;


import com.hutech.websiteOnThiTracNghiem.Constant;
import com.hutech.websiteOnThiTracNghiem.PublicFunction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String hello(Model model) {
        String msg = PublicFunction.CombinePath(Constant.ROOT_PATH, Constant.STORAGE_DIRECTORY);
        model.addAttribute("message", msg);
        return "index";
    }
}
