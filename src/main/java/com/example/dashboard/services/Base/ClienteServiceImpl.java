package com.example.dashboard.services.Base;

import com.example.dashboard.entities.Cliente;
import com.example.dashboard.repositories.BaseRepository;
import com.example.dashboard.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente,Long> implements ClienteService {

   private ClienteRepository clienteRepository;

   public ClienteServiceImpl(ClienteRepository clienteRepository) {
       super((BaseRepository<Cliente, Long>) clienteRepository);
       this.clienteRepository = clienteRepository;
   }
}
