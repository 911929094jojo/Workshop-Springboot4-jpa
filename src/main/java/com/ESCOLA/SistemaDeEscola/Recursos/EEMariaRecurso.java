package com.ESCOLA.SistemaDeEscola.Recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ESCOLA.SistemaDeEscola.Entidades.EEMaria;

@RestController
@RequestMapping(value ="/EEMatia")
public class EEMariaRecurso {
@GetMapping
public ResponseEntity<EEMaria> findAll(){
EEMaria Maria = new EEMaria(2L,"MARIA");
return ResponseEntity.ok().body(Maria);
}
}
