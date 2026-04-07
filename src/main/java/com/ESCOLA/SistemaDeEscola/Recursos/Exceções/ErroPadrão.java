package com.ESCOLA.SistemaDeEscola.Recursos.Exceções;

import java.io.Serializable;
import java.time.Instant;

public class ErroPadrão implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Instant timestamp;
	private Integer status;
private String error;
private String message;
	public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

	private String path;
	
	public ErroPadrão() {
		
	}

	public Instant getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public ErroPadrão(Instant timestamp, Integer status, String error, String path, String message) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.path = path;
	}
}
