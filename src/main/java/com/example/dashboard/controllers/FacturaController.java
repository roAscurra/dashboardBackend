package com.example.dashboard.controllers;

import com.example.dashboard.entities.Factura;
import com.example.dashboard.services.Base.ClienteServiceImpl;
import com.example.dashboard.services.Base.FacturaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/factura")
public class FacturaController extends BaseControllerImpl<Factura, FacturaServiceImpl>{
    private FacturaServiceImpl service;
    public FacturaController(FacturaServiceImpl service) {
        super(service);
    }
}
<<<<<<< HEAD
=======

>>>>>>> ec891c0b646af286a4f33114a5648cf3cfa37c7c
