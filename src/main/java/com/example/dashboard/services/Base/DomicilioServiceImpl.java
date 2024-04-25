package com.example.dashboard.services.Base;

import com.example.dashboard.entities.Domicilio;
import com.example.dashboard.repositories.BaseRepository;
import com.example.dashboard.repositories.DomicilioRepository;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements DomicilioService{

    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl(DomicilioRepository domicilioRepository) {
        super((BaseRepository<Domicilio, Long>) domicilioRepository);
        this.domicilioRepository = domicilioRepository;
    }
}
