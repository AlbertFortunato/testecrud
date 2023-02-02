package com.cadastro.clientes.crud.clientes.repository;

import com.cadastro.clientes.crud.clientes.model.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {
}
