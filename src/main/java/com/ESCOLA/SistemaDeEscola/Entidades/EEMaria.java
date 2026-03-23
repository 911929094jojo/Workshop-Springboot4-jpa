package com.ESCOLA.SistemaDeEscola.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TABNomedaESC")
public class EEMaria {
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private Long id;
	private String Maria = "Maria auxiliadora";

	public EEMaria() {}
public EEMaria (Long id,String Maria) {
	this.id=id;
	this.Maria=Maria;
}
public String getMaria() {
	return this.Maria;
}
public Long getId() {
	return id;
}

}
