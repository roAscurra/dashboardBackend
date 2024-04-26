package com.example.dashboard.controllers;

import com.example.dashboard.entities.Categoria;
import com.example.dashboard.entities.Cliente;
import com.example.dashboard.services.Base.CategoriaServiceImpl;
import com.example.dashboard.services.Base.ClienteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/categoria")
public class CategoriaController extends BaseControllerImpl<Categoria, CategoriaServiceImpl>{
    private CategoriaServiceImpl service;
    public CategoriaController(CategoriaServiceImpl service) {
        super(service);
    }
}
