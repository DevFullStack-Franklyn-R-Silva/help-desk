package com.github.devfullstackfranklynrsilva.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.devfullstackfranklynrsilva.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
