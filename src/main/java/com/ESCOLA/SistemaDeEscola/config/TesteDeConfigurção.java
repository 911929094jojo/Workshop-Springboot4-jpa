package com.ESCOLA.SistemaDeEscola.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ESCOLA.SistemaDeEscola.Entidades.Turma;
import com.ESCOLA.SistemaDeEscola.Entidades.Usuario;
import com.ESCOLA.SistemaDeEscola.Repositorios.TurmaRepositorio;
import com.ESCOLA.SistemaDeEscola.Repositorios.UsuarioRepositorio;

@Configuration
@Profile("Teste")
public class TesteDeConfigurção implements CommandLineRunner{
	@Autowired
	private UsuarioRepositorio UsuarioRepositorio;
	@Autowired
	 private TurmaRepositorio TurmaRepositorio;
	@Override
	public void run(String... args) throws Exception {
Usuario U1 = new Usuario(null,"Jonathan","911929094");
Usuario U2 = new Usuario(null,"Sarah","960801186");


	
Turma J = new Turma(null,"Serie-3B","Periodo-Noturno");
Turma S = new Turma(null,"Serie-1C","Periodo-Matiturno");
J.AdicionarUsuario(U1);
S.AdicionarUsuario(U2);
TurmaRepositorio.saveAll(Arrays.asList(J,S));

UsuarioRepositorio.saveAll(Arrays.asList(U1,U2));
	}
}
