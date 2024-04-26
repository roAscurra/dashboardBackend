package com.example.dashboard.controllers;

import com.example.dashboard.entities.Provincia;
import com.example.dashboard.services.Base.PaisServiceImpl;
import com.example.dashboard.services.Base.ProvinciaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/provincia")
public class ProvinciaController extends BaseControllerImpl<Provincia, ProvinciaServiceImpl> {
    private ProvinciaServiceImpl service;
    public ProvinciaController(ProvinciaServiceImpl service) {
        super(service);
    }
}
