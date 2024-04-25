package com.example.dashboard.services.Base;

import com.example.dashboard.entities.Localidad;
import com.example.dashboard.repositories.BaseRepository;
import com.example.dashboard.repositories.LocalidadRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(LocalidadRepository localidadRepository) {
        super((BaseRepository<Localidad,Long>) localidadRepository);
        this.localidadRepository = localidadRepository;
    }
}
