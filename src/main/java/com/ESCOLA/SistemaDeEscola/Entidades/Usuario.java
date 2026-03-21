package com.ESCOLA.SistemaDeEscola.Entidades;
 import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_Usuario")
 public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Nome;
	private String Matricula;
	
	public Usuario() {
	
	}

	public Usuario(Long id, String Nome, String Matricula) {
		super();
		this.id = id;
		this.Nome = Nome;
		this.Matricula = Matricula;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Long getId() {
		return id;
	}

	public String getMatricula() {
		return Matricula;
	}
	
}
