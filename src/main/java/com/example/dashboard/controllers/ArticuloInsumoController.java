package com.example.dashboard.controllers;

import com.example.dashboard.entities.Articulo;
import com.example.dashboard.entities.ArticuloInsumo;
import com.example.dashboard.services.Base.ArticuloInsumoServiceImpl;
import com.example.dashboard.services.Base.ArticuloServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/articuloInsumo")
public class ArticuloInsumoController extends BaseControllerImpl<ArticuloInsumo, ArticuloInsumoServiceImpl> {
    private ArticuloInsumoServiceImpl service;
    public ArticuloInsumoController(ArticuloInsumoServiceImpl service) {
        super(service);
    }
}

