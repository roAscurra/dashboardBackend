package com.example.dashboard.services.Base;

import com.example.dashboard.entities.Pedido;
import com.example.dashboard.repositories.BaseRepository;
import com.example.dashboard.repositories.PedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido, Long> implements PedidoService{
    private PedidoRepository pedidoRepository;

    public PedidoServiceImpl(PedidoRepository pedidoRepository) {
        super((BaseRepository<Pedido, Long>) pedidoRepository);
        this.pedidoRepository = pedidoRepository;
    }
}
