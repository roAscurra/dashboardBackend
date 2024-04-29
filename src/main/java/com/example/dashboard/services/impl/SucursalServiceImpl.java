package com.example.dashboard.services.impl;

import com.example.dashboard.entities.Sucursal;
import com.example.dashboard.repositories.BaseRepository;
import com.example.dashboard.repositories.SucursalRepository;
import com.example.dashboard.services.SucursalService;
import org.springframework.stereotype.Service;

@Service
public class SucursalServiceImpl extends BaseServiceImpl<Sucursal,Long> implements SucursalService {
    private SucursalRepository sucursalRepository;

    public SucursalServiceImpl(SucursalRepository sucursalRepository) {
        super((BaseRepository<Sucursal, Long>) sucursalRepository);
    }
}
