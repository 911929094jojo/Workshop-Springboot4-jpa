package com.ESCOLA.SistemaDeEscola.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ESCOLA.SistemaDeEscola.Entidades.Usuario;

public interface  UsuarioRepositorio extends JpaRepository<Usuario, Long> {

}
