package com.example.dashboard.controllers;

import com.example.dashboard.entities.DetallePedido;
import com.example.dashboard.services.Base.ClienteServiceImpl;
import com.example.dashboard.services.Base.DetallePedidoService;
import com.example.dashboard.services.Base.DetallePedidoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/detallePedido")
public class DetallePedidoController extends BaseControllerImpl<DetallePedido, DetallePedidoServiceImpl>{
    private DetallePedidoServiceImpl service;
    public DetallePedidoController(DetallePedidoServiceImpl service) {
        super(service);
    }
}

