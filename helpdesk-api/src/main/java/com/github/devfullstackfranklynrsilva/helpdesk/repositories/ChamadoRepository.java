package com.github.devfullstackfranklynrsilva.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.devfullstackfranklynrsilva.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
