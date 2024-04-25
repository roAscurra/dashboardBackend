package com.example.dashboard.services.Base;

import com.example.dashboard.entities.Empresa;
import com.example.dashboard.repositories.BaseRepository;
import com.example.dashboard.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImpl extends BaseServiceImpl<Empresa, Long> implements EmpresaService{
    private EmpresaRepository empresaRepository;

    public EmpresaServiceImpl(EmpresaRepository empresaRepository){
        super((BaseRepository<Empresa, Long>) empresaRepository);
        this.empresaRepository = empresaRepository;
    }
}
