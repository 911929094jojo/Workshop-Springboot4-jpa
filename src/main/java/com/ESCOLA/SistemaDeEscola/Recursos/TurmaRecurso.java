package com.ESCOLA.SistemaDeEscola.Recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ESCOLA.SistemaDeEscola.Entidades.Turma;

@RestController
@RequestMapping(value ="/Turma")

public class TurmaRecurso {

	@GetMapping
public ResponseEntity<Turma> findAll(){
Turma Turma = new Turma(2L,"3B","Noturno");
return ResponseEntity.ok().body(Turma);
}
}
