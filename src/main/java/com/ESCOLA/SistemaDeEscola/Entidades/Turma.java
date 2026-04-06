package com.ESCOLA.SistemaDeEscola.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "TB_Turma")
	public class Turma implements  Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	
private Long id;
private String serie;
private String periodo;
@JsonIgnore
@OneToMany(mappedBy="turma")
private List<Usuario>Usuarios = new ArrayList<>(); 
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
	Turma other = (Turma) obj;
	return Objects.equals(id, other.id);
}

public Turma() {}

public Turma (Long id,String serie,String periodo) {
	this.id=id;
	this.serie=serie;
	this.periodo=periodo;
}


public String getSerie() {
	return this.serie;
}
public String getPeriodo() {
	return this.periodo;
}
public Long getId() {
	return id;
}
public List<Usuario> getUsuarios() {
	return Usuarios;
}
public void AdicionarUsuario(Usuario usuario) {
	this.Usuarios.add(usuario);
	usuario.setTurma(this);
}

}
