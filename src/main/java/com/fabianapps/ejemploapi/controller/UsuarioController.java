package com.fabianapps.ejemploapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fabianapps.ejemploapi.model.Usuario;

@RestController
public class UsuarioController {

	@GetMapping("/getusuario")
	public Usuario devolverUsuario() {
		return new Usuario("Homero Simpson", "99999999");
	}

	@GetMapping("/usuario/porid")
	public Usuario devolverUsuario(@RequestParam(value = "id", defaultValue = "1") String id) {
		return new Usuario("Homero Simpson", id);
	}

	@GetMapping("/usuario/poridynombre")
	public Usuario devolverUsuario(@RequestParam(value = "id") String id,
			@RequestParam(value = "nombre") String nombre) {
		return new Usuario(nombre, id);
	}

	@GetMapping("/usuario/pathvariables/{id}/{nombre}")
	public Usuario devolverUsuarioPathVariable(@PathVariable(value = "id") String id,
			@PathVariable(value = "nombre") String nombre) {
		return new Usuario(nombre, id);
	}

	@PostMapping(path = "/usuario/crear", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> create(@RequestBody Usuario newUser) {
		//comentario
		return new ResponseEntity<>(new Usuario(newUser.getNombre()+"-ok", newUser.getCi()), HttpStatus.CREATED);
	}
	
	
}
