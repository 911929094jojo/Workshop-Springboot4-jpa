package com.ESCOLA.SistemaDeEscola.Recursos.Exceções;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ESCOLA.SistemaDeEscola.Serviços.Exceções.RecursoNãoEcontradoExceção;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ManipuladorDeExceçõesDeRecursos {
	@ExceptionHandler(RecursoNãoEcontradoExceção.class)
	public ResponseEntity<ErroPadrão> RecursoNaoEncontrado(RecursoNãoEcontradoExceção e,HttpServletRequest requisição){
		String error = "Recurso nao encontrado EDITADO";
		HttpStatus  status = HttpStatus.NOT_FOUND;
	 ErroPadrão err = new ErroPadrão(Instant.now(), status.value(), error, e.getMessage(),requisição.getRequestURI());
	return ResponseEntity.status(status).body(err);
	}

}
