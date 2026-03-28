package com.ESCOLA.SistemaDeEscola.Recursos;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ESCOLA.SistemaDeEscola.Entidades.Turma;
import com.ESCOLA.SistemaDeEscola.Serviços.ServiçosDaTurma;


@RestController
@RequestMapping (value = "/Turma")
public class TurmaRecurso {
	@Autowired
	private ServiçosDaTurma serviço;
	@GetMapping
	public ResponseEntity<List<Turma>> findAll(){
List<Turma> list = serviço.findAll();
return ResponseEntity.ok().body(list);

	}

@GetMapping(value ="/{id}")
public ResponseEntity<Turma>findById(@PathVariable Long id){
Turma obj = serviço.findById(id);
return ResponseEntity.ok().body(obj);
}

	}


