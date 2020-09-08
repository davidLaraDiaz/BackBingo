package com.progracol.usuarios.interfaceService;

import com.progracol.usuarios.model.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
	
}
