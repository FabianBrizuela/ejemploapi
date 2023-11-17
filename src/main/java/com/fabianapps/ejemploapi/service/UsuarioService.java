package com.fabianapps.ejemploapi.service;

import java.util.ArrayList;
import java.util.Optional;

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
	
	public UsuarioDTO recuperarXid(long id) {
		Optional<Usuario> usuario = this.usuarioRepository.findById(id);
		UsuarioDTO dto = new UsuarioDTO();
		if(usuario.isPresent()) {
			Usuario usuarioEntity = usuario.get();
			dto.setNombre(usuarioEntity.getNombre());
			dto.setApellido(usuarioEntity.getApellido());
			dto.setNroDocumento(usuarioEntity.getNroDocumento());
			dto.setEdad(usuarioEntity.getEdad());
		}else {
			dto.setMensaje("No se encontro usuario con el ID: "+id);
		}
		return dto;
	}
	
	
	/**
	 * Este metodo recupera todos los usuarios sin importar el ID
	 * @return
	 */
	public ArrayList<UsuarioDTO> recuperarTodos(){
		Iterable<Usuario> usuarios = this.usuarioRepository.findAll();
		ArrayList<UsuarioDTO> usuarioDTOs = new ArrayList<>();
		
//		for (Usuario usuario : usuarios) {
//			UsuarioDTO dto = new UsuarioDTO();	 
//			dto.setNombre(usuario.getNombre());
//			dto.setApellido(usuario.getApellido());
//			dto.setNroDocumento(usuario.getNroDocumento());
//			dto.setEdad(usuario.getEdad());
//			usuarioDTOs.add(dto);
//		}
		
		usuarios.forEach(usuario -> {
			UsuarioDTO dto = new UsuarioDTO();	 
			dto.setNombre(usuario.getNombre());
			dto.setApellido(usuario.getApellido());
			dto.setNroDocumento(usuario.getNroDocumento());
			dto.setEdad(usuario.getEdad());
			usuarioDTOs.add(dto);
		});
		
		return usuarioDTOs;
	}
	
	public void borrarXid(long id) {
		this.usuarioRepository.deleteById(id);
	}
	
	
}
