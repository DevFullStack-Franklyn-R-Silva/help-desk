package com.github.devfullstackfranklynrsilva.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.devfullstackfranklynrsilva.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
