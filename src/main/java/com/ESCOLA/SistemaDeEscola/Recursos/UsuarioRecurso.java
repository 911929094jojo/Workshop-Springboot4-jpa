package com.ESCOLA.SistemaDeEscola.Recursos;


import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

@PostMapping
public ResponseEntity<Usuario > Inserir(@RequestBody Usuario obj){
	obj= serviço.Inserir(obj);
	URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();

	return ResponseEntity.created(uri).body(obj);}
@DeleteMapping(value="/{id}")
public ResponseEntity<Void> Deletar(@PathVariable Long  id){
serviço.Deletar(id);
return ResponseEntity.noContent().build();
}
@PutMapping(value = "/{id}")
public ResponseEntity<Usuario> Atualização(@PathVariable Long id,@RequestBody Usuario obj){
	obj = serviço.Atualizar(id, obj);
	return ResponseEntity.ok().body(obj);
}
}


