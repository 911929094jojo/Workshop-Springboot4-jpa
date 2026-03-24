package com.ESCOLA.SistemaDeEscola.Serviços;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ESCOLA.SistemaDeEscola.Entidades.Usuario;
import com.ESCOLA.SistemaDeEscola.Repositorios.UsuarioRepositorio;
@Service
public class ServiçosDoUsuario {
	@Autowired
	private UsuarioRepositorio repositorio;
public List<Usuario> findAll(){
	return repositorio.findAll();
}
public Usuario findById(Long id) {
	Optional<Usuario> obj = repositorio.findById(id);
			 return obj.get();
}
}