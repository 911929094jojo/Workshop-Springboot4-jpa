package com.ESCOLA.SistemaDeEscola.Serviços;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ESCOLA.SistemaDeEscola.Entidades.Turma;
import com.ESCOLA.SistemaDeEscola.Repositorios.TurmaRepositorio;
@Service
public class ServiçosDaTurma {
	@Autowired
	private TurmaRepositorio repositorio;
public List<Turma> findAll(){
	return repositorio.findAll();
}
public Turma findById(Long id) {
	Optional<Turma> obj = repositorio.findById(id);
			 return obj.get();
}
}