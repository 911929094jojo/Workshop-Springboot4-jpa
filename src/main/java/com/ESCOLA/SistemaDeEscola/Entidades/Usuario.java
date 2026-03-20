package com.ESCOLA.SistemaDeEscola.Entidades;
 import java.io.Serializable;
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String Nome;
	private int Matricula;
	
	public Usuario() {
	
	}

	public Usuario(Long id, String Nome, int Matricula) {
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

	public int getMatricula() {
		return Matricula;
	}
	

}
