package br.com.cdb.bancodigital_jpa.repository;

import br.com.cdb.bancodigital_jpa.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
