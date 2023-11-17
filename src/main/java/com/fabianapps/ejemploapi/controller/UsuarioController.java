package com.fabianapps.ejemploapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fabianapps.ejemploapi.model.UsuarioDTO;
import com.fabianapps.ejemploapi.service.UsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
//	@GetMapping("/getusuario")
//	public UsuarioDTO devolverUsuario() {
//		return new UsuarioDTO("Homero Simpson", "99999999");
//	}
//
//	@GetMapping("/usuario/porid")
//	public UsuarioDTO devolverUsuario(@RequestParam(value = "id", defaultValue = "1") String id) {
//		return new UsuarioDTO("Homero Simpson", id);
//	}
//
//	@GetMapping("/usuario/poridynombre")
//	public UsuarioDTO devolverUsuario(@RequestParam(value = "id") String id,
//			@RequestParam(value = "nombre") String nombre) {
//		return new UsuarioDTO(nombre, id);
//	}
//
//	@GetMapping("/usuario/pathvariables/{id}/{nombre}")
//	public UsuarioDTO devolverUsuarioPathVariable(@PathVariable(value = "id") String id,
//			@PathVariable(value = "nombre") String nombre) {
//		return new UsuarioDTO(nombre, id);
//	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@PostMapping(path = "/usuario/crear", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> create(@RequestBody UsuarioDTO dto) {
		
		this.usuarioService.crearUsuario(dto);
		
		//comentario
		return new ResponseEntity<>("Usuario creado!", HttpStatus.CREATED);
	}
	
	
}
