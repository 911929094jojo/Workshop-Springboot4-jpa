package com.ESCOLA.SistemaDeEscola.Entidades;
 import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	@ManyToOne
	@JoinColumn
	private Turma turma;
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id);
	}

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

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma2) {
this.turma=turma2;		
	}


}
