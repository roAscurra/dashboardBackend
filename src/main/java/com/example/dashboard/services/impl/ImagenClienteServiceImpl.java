package com.example.dashboard.services.impl;

import com.example.dashboard.entities.ImagenCliente;
import com.example.dashboard.repositories.BaseRepository;
import com.example.dashboard.repositories.ImagenClienteRepository;
import com.example.dashboard.services.ImagenClienteService;
import org.springframework.stereotype.Service;

@Service
public class ImagenClienteServiceImpl extends BaseServiceImpl<ImagenCliente,Long> implements ImagenClienteService {

    private ImagenClienteRepository imagenClienteRepository;

    public ImagenClienteServiceImpl(ImagenClienteRepository imagenClienteRepository) {
        super((BaseRepository<ImagenCliente, Long>) imagenClienteRepository);
        this.imagenClienteRepository = imagenClienteRepository;
    }
}
