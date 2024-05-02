package com.github.devfullstackfranklynrsilva.helpdesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.devfullstackfranklynrsilva.helpdesk.domain.Chamado;
import com.github.devfullstackfranklynrsilva.helpdesk.repositories.ChamadoRepository;
import com.github.devfullstackfranklynrsilva.helpdesk.services.exceptions.ObjectNotFoundException;

@Service
public class ChamadoService {

	@Autowired
	private ChamadoRepository repository;

	public Chamado findById(Integer id) {
		Optional<Chamado> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encotraado! Id: " + id));
	}

	public List<Chamado> findALL() {
		return repository.findAll();
	}

}
