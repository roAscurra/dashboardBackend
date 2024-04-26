package com.example.dashboard.services.Base;

import com.example.dashboard.entities.Articulo;
import com.example.dashboard.entities.Cliente;
import com.example.dashboard.repositories.ArticuloRepository;
import com.example.dashboard.repositories.BaseRepository;
import com.example.dashboard.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticuloServiceImpl extends BaseServiceImpl<Articulo, Long> implements ArticuloService{
    private ArticuloRepository articuloRepository;
    public ArticuloServiceImpl(ArticuloRepository articuloRepository){
        super((BaseRepository<Articulo, Long>) articuloRepository);
        this.articuloRepository = articuloRepository;
    }

}
