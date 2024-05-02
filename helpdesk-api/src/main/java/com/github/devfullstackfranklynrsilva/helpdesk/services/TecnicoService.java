package com.github.devfullstackfranklynrsilva.helpdesk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.devfullstackfranklynrsilva.helpdesk.domain.Tecnico;
import com.github.devfullstackfranklynrsilva.helpdesk.repositories.TecnicoRepository;
import com.github.devfullstackfranklynrsilva.helpdesk.services.exceptions.ObjectNotFoundException;


@Service
public class TecnicoService {

	@Autowired
	private TecnicoRepository repository;

	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Obejto não encontrado! Id: "+ id));
	}
}
