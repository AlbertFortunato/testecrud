package com.br.cadastro.endereco;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EnderecoService {

    private final EnderecoFeign enderecoFeign;

    EnderecoResponse executa(EnderecoRequest request){
        return enderecoFeign.buscaEnderecoCep(request.getCep());
    }

}
