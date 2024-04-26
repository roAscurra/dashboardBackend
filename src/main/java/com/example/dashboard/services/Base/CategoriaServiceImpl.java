package com.example.dashboard.services.Base;

import com.example.dashboard.entities.Categoria;
import com.example.dashboard.entities.Cliente;
import com.example.dashboard.repositories.BaseRepository;
import com.example.dashboard.repositories.CategoriaRepository;
import com.example.dashboard.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl extends BaseServiceImpl<Categoria,Long> implements CategoriaService {

    private CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        super((BaseRepository<Categoria, Long>) categoriaRepository);
        this.categoriaRepository = categoriaRepository;
    }
}
