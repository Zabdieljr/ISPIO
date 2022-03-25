package com.zarenas.ispio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ClientsController {
    @RequestMapping({"/clients", "/clients/index", "/clients/index.html"})
    public String index() {
        return "clients/index";
    }
}
