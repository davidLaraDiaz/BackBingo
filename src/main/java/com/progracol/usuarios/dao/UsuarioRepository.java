package com.progracol.usuarios.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.progracol.usuarios.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

	public Usuario findByUsername( String username);
	
}
