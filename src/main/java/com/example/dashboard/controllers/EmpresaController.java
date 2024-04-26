package com.example.dashboard.controllers;

import com.example.dashboard.entities.Empresa;
import com.example.dashboard.entities.Localidad;
import com.example.dashboard.services.Base.EmpresaServiceImpl;
import com.example.dashboard.services.Base.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/empresas")
public class EmpresaController extends BaseControllerImpl<Empresa, EmpresaServiceImpl>{
    private EmpresaServiceImpl service;
    public EmpresaController(EmpresaServiceImpl service) {
        super(service);
    }
}
