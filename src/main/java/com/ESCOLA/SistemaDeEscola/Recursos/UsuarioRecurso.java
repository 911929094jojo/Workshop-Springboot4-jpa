package com.ESCOLA.SistemaDeEscola.Recursos;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ESCOLA.SistemaDeEscola.Entidades.Usuario;
import com.ESCOLA.SistemaDeEscola.Serviços.ServiçosDoUsuario;


@RestController
@RequestMapping (value = "/Usuario")
public class UsuarioRecurso {
	@Autowired
	private ServiçosDoUsuario serviço;
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll(){
List<Usuario> list = serviço.findAll();
return ResponseEntity.ok().body(list);

	}

@GetMapping(value ="/{id}")
public ResponseEntity<Usuario>findById(@PathVariable Long id){
Usuario obj = serviço.findById(id);
return ResponseEntity.ok().body(obj);
}

	}


