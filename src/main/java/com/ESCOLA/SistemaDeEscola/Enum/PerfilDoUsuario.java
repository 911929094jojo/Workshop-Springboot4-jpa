package com.ESCOLA.SistemaDeEscola.Enum;

public enum PerfilDoUsuario {
	ALUNO(1),
	PROFESSOR(2);
	
	private int NUM;
	private PerfilDoUsuario (int num) {
		this.NUM =num;
	}
	public int getNum() {
		return NUM;
	}
	public static PerfilDoUsuario valor(int NUM) {
		for(PerfilDoUsuario valor : PerfilDoUsuario.values()) {
			if(valor.getNum() == NUM) {
				return valor;
			}
		}
		throw new IllegalArgumentException("Perfil do Usuario invalido");
	}
	
}
