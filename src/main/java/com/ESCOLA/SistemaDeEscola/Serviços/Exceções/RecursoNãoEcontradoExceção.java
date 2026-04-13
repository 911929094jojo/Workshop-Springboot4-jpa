package com.ESCOLA.SistemaDeEscola.Serviços.Exceções;

public class RecursoNãoEcontradoExceção extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 public RecursoNãoEcontradoExceção(Object id) {
	 super("EDITADO Recurso não encotrado:"+ id);
 }
}
