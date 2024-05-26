package com.sun.pp.controller;

import com.sun.pp.model.Medicines;
import com.sun.pp.service.MedicinesService;
import com.sun.pp.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
@RequestMapping("/medicines/")
public class MedicinesRestController {

    private Services services;

    @Autowired
    public MedicinesRestController(Services services) {
        this.services = services;
    }

    @GetMapping("hi")
    public String hi() {
        return "<h1>mera project  he re dada </h1>";
    }

    @PostMapping(path = "create/medi/")
    public Medicines createMedi(@RequestBody Medicines medicines) {
        Medicines medicinesSave = services.createMedi(medicines);

        System.out.println(medicinesSave.getName());
//        EntityResponse.ok("");
        return medicinesSave;
    }

    @GetMapping(path = "get/medi")
    public Medicines getMedi(@PathVariable String medicines_name) {
        return null;
    }

    @GetMapping("get/medies")
    public List<Medicines> getMedies() {
        return null;
    }
}
