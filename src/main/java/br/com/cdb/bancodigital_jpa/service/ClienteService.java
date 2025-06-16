package br.com.cdb.bancodigital_jpa.service;

import br.com.cdb.bancodigital_jpa.entity.Cliente;
import br.com.cdb.bancodigital_jpa.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService
{
    @Autowired
    private ClienteRepository clienteRepository;
    public Cliente salvarCliente(String nome, Long cpf){
        //VALIDAR OS CAMPOS
        Cliente cliente  = new Cliente;
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        return clienteRepository.save(cliente);
        // CRIAR O OBJETO CLIENTE
    }
}
