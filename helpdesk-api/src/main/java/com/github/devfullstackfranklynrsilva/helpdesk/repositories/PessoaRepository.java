package com.github.devfullstackfranklynrsilva.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.devfullstackfranklynrsilva.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
