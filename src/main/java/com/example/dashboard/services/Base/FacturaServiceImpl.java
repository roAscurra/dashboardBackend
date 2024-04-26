package com.example.dashboard.services.Base;

import com.example.dashboard.entities.Cliente;
import com.example.dashboard.entities.Factura;
import com.example.dashboard.repositories.BaseRepository;
import com.example.dashboard.repositories.ClienteRepository;
import com.example.dashboard.repositories.FacturaRepository;

public class FacturaServiceImpl extends BaseServiceImpl<Factura, Long> implements FacturaService{
    private FacturaRepository facturaRepository;

    public FacturaServiceImpl(FacturaRepository facturaRepository) {
        super((BaseRepository<Factura, Long>) facturaRepository);
        this.facturaRepository = facturaRepository;
    }
}
