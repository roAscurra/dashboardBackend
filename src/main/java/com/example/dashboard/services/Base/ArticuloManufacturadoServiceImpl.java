package com.example.dashboard.services.Base;

import com.example.dashboard.entities.ArticuloManufacturado;
import com.example.dashboard.repositories.ArticuloManufacturadoRepository;
import com.example.dashboard.repositories.BaseRepository;

import org.springframework.stereotype.Service;
@Service
public class ArticuloManufacturadoServiceImpl extends BaseServiceImpl<ArticuloManufacturado,Long> implements ArticuloManufacturadoService {

<<<<<<< HEAD
    private ArticuloManufacturadoRepository ArticuloManufacturadoRepository;

    public ArticuloManufacturadoServiceImpl(ArticuloManufacturadoRepository ArticuloManufacturadoRepository) {
        super((BaseRepository<ArticuloManufacturado, Long>) articuloManufacturadoRepository);
        this.articuloManufacturadoRepository = articuloManufacturadoRepository;
    }
=======
        private ArticuloManufacturadoRepository articuloManufacturadoRepository;

        public ArticuloManufacturadoServiceImpl(ArticuloManufacturadoRepository articuloManufacturadoRepository) {
            super((BaseRepository<ArticuloManufacturado, Long>) articuloManufacturadoRepository);
            this.articuloManufacturadoRepository = articuloManufacturadoRepository;
        }
>>>>>>> ec891c0b646af286a4f33114a5648cf3cfa37c7c
}
