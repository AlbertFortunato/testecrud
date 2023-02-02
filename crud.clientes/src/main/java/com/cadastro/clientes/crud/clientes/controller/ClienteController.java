package com.cadastro.clientes.crud.clientes.controller;

import com.cadastro.clientes.crud.clientes.model.ClienteEntity;
import com.cadastro.clientes.crud.clientes.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping("/cadastro")
    public ResponseEntity cadastroCliente(@RequestBody ClienteEntity cliente){
        return ResponseEntity.ok(clienteService.salvar(cliente));
    }

    @GetMapping("/cadastro/{id}")
    public ResponseEntity consultaCliente(@PathVariable ("id")Integer id){
        return ResponseEntity.ok(clienteService.consulta(id));
    }

}
