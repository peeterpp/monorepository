package com.example.pasir_polinski_piotr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.pasir_polinski_piotr.model.AppInfo;

@RestController
public class TestController {
    @GetMapping("/api/test")
    public String test() {
        return "Hello World";
    }

    @GetMapping("/api/info")
    public AppInfo getInfo() {
        return new AppInfo("Aplikacja Budżetowa", AppInfo.getAppVersion(), AppInfo.getMessage());
    }
}
