package com.ESCOLA.SistemaDeEscola.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ESCOLA.SistemaDeEscola.Entidades.Turma;
import com.ESCOLA.SistemaDeEscola.Repositorios.TurmaRepositorio;

@Configuration
@Profile("Teste")
public class TurmaConfiguração implements CommandLineRunner{
@Autowired
private TurmaRepositorio turmarepositorio;

@Override
public void run(String... args) throws Exception {
	Turma A = new Turma(null,"3B","Noturno");
	turmarepositorio.saveAll(Arrays.asList(A));
}

}
