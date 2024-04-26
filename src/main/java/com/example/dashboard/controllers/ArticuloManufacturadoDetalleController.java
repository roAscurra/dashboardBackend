package com.example.dashboard.controllers;

import com.example.dashboard.entities.ArticuloManufacturadoDetalle;
import com.example.dashboard.services.Base.ArticuloManufacturadoDetalleServiceImpl;
<<<<<<< HEAD
=======
import com.example.dashboard.services.Base.ClienteServiceImpl;
>>>>>>> ec891c0b646af286a4f33114a5648cf3cfa37c7c
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/articuloManufacturadoDetalle")
public class ArticuloManufacturadoDetalleController extends BaseControllerImpl <ArticuloManufacturadoDetalle, ArticuloManufacturadoDetalleServiceImpl> {
    private ArticuloManufacturadoDetalleServiceImpl service;

    public ArticuloManufacturadoDetalleController(ArticuloManufacturadoDetalleServiceImpl service) {
        super(service);
    }
}
