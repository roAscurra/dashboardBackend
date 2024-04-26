package com.example.dashboard.controllers;

import com.example.dashboard.entities.Usuario;
import com.example.dashboard.services.Base.ProvinciaServiceImpl;
import com.example.dashboard.services.Base.UsuarioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/usuario")
public class UsuarioController extends BaseControllerImpl<Usuario, UsuarioServiceImpl>{
    private UsuarioServiceImpl service;
    public UsuarioController(UsuarioServiceImpl service) {
        super(service);
    }
}
