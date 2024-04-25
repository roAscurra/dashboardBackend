package com.example.dashboard.services.Base;

import com.example.dashboard.entities.Provincia;
import com.example.dashboard.repositories.BaseRepository;
import com.example.dashboard.repositories.ProvinciaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaServiceImpl extends BaseServiceImpl<Provincia,Long> implements ProvinciaService {
    private ProvinciaRepository provinciaRepository;

    public ProvinciaServiceImpl(ProvinciaRepository provinciaRepository) {
        super((BaseRepository<Provincia, Long>) provinciaRepository);
        this.provinciaRepository = provinciaRepository;
    }
}
