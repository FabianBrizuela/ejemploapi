package com.fabianapps.ejemploapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.fabianapps.ejemploapi.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {	

}
