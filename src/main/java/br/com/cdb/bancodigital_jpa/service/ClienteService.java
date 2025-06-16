package br.com.cdb.bancodigital_jpa.service;

import br.com.cdb.bancodigital_jpa.entity.Cliente;
import br.com.cdb.bancodigital_jpa.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService
{
    @Autowired
    private ClienteRepository clienteRepository;
    public Cliente salvarCliente(String nome, Long cpf){
        //VALIDAR OS CAMPOS
        // CRIAR O OBJETO CLIENTE
        Cliente cliente  = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        return clienteRepository.save(cliente);
    }
    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }
    public Cliente getClientePorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }
}
