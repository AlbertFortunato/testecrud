package com.cadastro.clientes.crud.clientes.service;

import com.cadastro.clientes.crud.clientes.model.ClienteEntity;
import com.cadastro.clientes.crud.clientes.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

  @Autowired
  private ClienteRepository repository;

  public ClienteEntity salvar(ClienteEntity entity){
      return repository.save(entity);
  }

  public Optional<ClienteEntity> consulta(Integer entity){
      return repository.findById(entity);
  }

}
