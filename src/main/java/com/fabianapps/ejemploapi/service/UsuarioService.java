package com.fabianapps.ejemploapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabianapps.ejemploapi.entity.Usuario;
import com.fabianapps.ejemploapi.model.UsuarioDTO;
import com.fabianapps.ejemploapi.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public UsuarioRepository getUsuarioRepository() {
		return usuarioRepository;
	}

	public void setUsuarioRepository(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	public void crearUsuario(UsuarioDTO dto) {
		Usuario usuario = new Usuario();
		usuario.setNombre(dto.getNombre());
		usuario.setApellido(dto.getApellido());
		usuario.setEdad(dto.getEdad());
		usuario.setNroDocumento(dto.getNroDocumento());
		
		this.usuarioRepository.save(usuario);
	}
}
