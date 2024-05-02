package com.github.devfullstackfranklynrsilva.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.devfullstackfranklynrsilva.helpdesk.domain.Chamado;
import com.github.devfullstackfranklynrsilva.helpdesk.domain.Cliente;
import com.github.devfullstackfranklynrsilva.helpdesk.domain.Tecnico;
import com.github.devfullstackfranklynrsilva.helpdesk.domain.enums.Perfil;
import com.github.devfullstackfranklynrsilva.helpdesk.domain.enums.Prioridade;
import com.github.devfullstackfranklynrsilva.helpdesk.domain.enums.Status;
import com.github.devfullstackfranklynrsilva.helpdesk.repositories.ChamadoRepository;
import com.github.devfullstackfranklynrsilva.helpdesk.repositories.ClienteRepository;
import com.github.devfullstackfranklynrsilva.helpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tec1 = new Tecnico(null, "Franklyn Roberto", "95623108091", "dev@dev.com", "123");
		tec1.addPerfis(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Linus Torvalds", "29962195039", "linus@linus.com", "123");

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1,
				cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
