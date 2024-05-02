package com.github.devfullstackfranklynrsilva.helpdesk.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cliente extends Pessoa{
	
	private List<Chamado> chamados = new ArrayList<>();
	
}
