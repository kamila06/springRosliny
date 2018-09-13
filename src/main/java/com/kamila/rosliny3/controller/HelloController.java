package com.kamila.rosliny3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("")
    public String blank(@RequestParam(value="user", required=false, defaultValue="Mr") String user, Model model) {
        model.addAttribute("user", user);
        return "index";
    }

    @RequestMapping("/index")
    public String index(@RequestParam(value="user", required=false, defaultValue="Mr") String user, Model model) {
        model.addAttribute("user", user);
        return "index";
    }

    @RequestMapping("/kontakt")
    public String kontakt() {
        return "kontakt";
    }

    @RequestMapping("/katalog")
    public String katalog() {
        return "katalog";
    }
}