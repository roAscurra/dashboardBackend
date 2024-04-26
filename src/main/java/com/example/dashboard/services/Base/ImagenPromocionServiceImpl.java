package com.example.dashboard.services.Base;

import com.example.dashboard.entities.ImagenPromocion;
import com.example.dashboard.repositories.BaseRepository;
import com.example.dashboard.repositories.ImagenPromocionRepository;
import org.springframework.stereotype.Service;

@Service
public class ImagenPromocionServiceImpl extends BaseServiceImpl<ImagenPromocion, Long> implements ImagenPromocionService {
    private ImagenPromocionRepository imagenPromocionRepository;
    public ImagenPromocionServiceImpl(ImagenPromocionRepository imagenPromocionRepository) {
        super((BaseRepository<ImagenPromocion, Long>)imagenPromocionRepository);
        this.imagenPromocionRepository = imagenPromocionRepository;
    }
}
