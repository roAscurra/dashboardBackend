package com.example.dashboard.services.Base;

import com.example.dashboard.entities.ArticuloInsumo;
import com.example.dashboard.repositories.ArticuloInsumoRepository;
import com.example.dashboard.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticuloInsumoServiceImpl extends BaseServiceImpl<ArticuloInsumo, Long> implements ArticuloInsumoService {
    private ArticuloInsumoRepository articuloInsumoRepository;
    public ArticuloInsumoServiceImpl(ArticuloInsumoRepository articuloInsumoRepository){
        super((BaseRepository<ArticuloInsumo, Long>) articuloInsumoRepository);
        this.articuloInsumoRepository = articuloInsumoRepository;
    }
}
