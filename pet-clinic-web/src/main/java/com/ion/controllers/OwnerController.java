package com.ion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owner")
public class OwnerController {

    @RequestMapping({"","/index.html","/index"})
    public String listVets(){
        return "owner/index";
    }
}
