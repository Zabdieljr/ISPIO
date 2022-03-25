package com.zarenas.ispio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PersonsController {

    @RequestMapping({"/persons", "/persons/index", "/persons/index.html"})
    public String index() {
        return "persons/index";
    }
}
