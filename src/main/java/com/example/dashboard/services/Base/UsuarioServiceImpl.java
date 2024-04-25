package com.example.dashboard.services.Base;

import com.example.dashboard.entities.Usuario;
import com.example.dashboard.repositories.BaseRepository;
import com.example.dashboard.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario,Long> implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        super((BaseRepository<Usuario,Long>) usuarioRepository);
        this.usuarioRepository = usuarioRepository;
    }
}
