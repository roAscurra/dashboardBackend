package com.example.dashboard.services.Base;

import com.example.dashboard.entities.Cliente;
import com.example.dashboard.entities.UnidadMedida;
import com.example.dashboard.repositories.BaseRepository;
import com.example.dashboard.repositories.ClienteRepository;
import com.example.dashboard.repositories.UnidadMedidaRepository;

public class UnidadMedidaServiceImpl extends BaseServiceImpl<UnidadMedida, Long> implements UnidadMedidaService{
    private UnidadMedidaRepository unidadMedidaRepository;

    public UnidadMedidaServiceImpl(UnidadMedidaRepository unidadMedidaRepository) {
        super((BaseRepository<UnidadMedida, Long>) unidadMedidaRepository);
        this.unidadMedidaRepository = unidadMedidaRepository;
    }
}
