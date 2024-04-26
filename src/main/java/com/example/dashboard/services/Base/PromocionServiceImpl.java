package com.example.dashboard.services.Base;

import com.example.dashboard.entities.Promocion;
import com.example.dashboard.repositories.BaseRepository;
import com.example.dashboard.repositories.PromocionRepository;
import org.springframework.stereotype.Service;

@Service
public class PromocionServiceImpl extends BaseServiceImpl<Promocion, Long> implements PromocionService {

    private PromocionRepository promocionRepository;

    public PromocionServiceImpl(PromocionRepository promocionRepository) {
        super(promocionRepository);
        this.promocionRepository = promocionRepository;
    }
}
