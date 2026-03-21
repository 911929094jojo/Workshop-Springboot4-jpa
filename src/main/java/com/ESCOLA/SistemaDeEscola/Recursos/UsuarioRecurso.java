package com.ESCOLA.SistemaDeEscola.Recursos;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ESCOLA.SistemaDeEscola.Entidades.Usuario;


@RestController
@RequestMapping (value = "/Usuario")
public class UsuarioRecurso {
	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		Usuario U1= new Usuario(1L,"jonathan","11223");
		return ResponseEntity.ok().body(U1);
	}

}
