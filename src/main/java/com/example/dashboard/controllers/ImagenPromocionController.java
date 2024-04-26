package com.example.dashboard.controllers;

import com.example.dashboard.entities.ImagenPromocion;
import com.example.dashboard.services.Base.ImagenPromocionServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/imagenPromocion")
public class ImagenPromocionController extends BaseControllerImpl<ImagenPromocion, ImagenPromocionServiceImpl>{
    private ImagenPromocionServiceImpl service;
    public ImagenPromocionController(ImagenPromocionServiceImpl service){
        super(service);
    }
}
