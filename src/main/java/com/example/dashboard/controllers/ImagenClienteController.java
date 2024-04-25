package com.example.dashboard.controllers;

import com.example.dashboard.entities.ImagenCliente;
import com.example.dashboard.services.Base.ImagenClienteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/imagenCliente")
public class ImagenClienteController extends BaseControllerImpl<ImagenCliente, ImagenClienteServiceImpl>{
}