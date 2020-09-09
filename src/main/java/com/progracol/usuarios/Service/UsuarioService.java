package com.progracol.usuarios.Service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.progracol.usuarios.dao.UsuarioRepository;
import com.progracol.usuarios.interfaceService.IUsuarioService;
import com.progracol.usuarios.model.Usuario;


@Service
public class UsuarioService implements IUsuarioService, UserDetailsService{
	
	private Logger logger = LoggerFactory.getLogger(UsuarioService.class);

	@Autowired
	private UsuarioRepository userDao;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = userDao.findByUsername(username);
		String miRol="";
		if (usuario == null) {
			String msg = "Error login, El usuario no existe en el sistema";
			logger.error(msg);
			throw new UsernameNotFoundException(msg);
		}else /*if(usuario.getRol_id().getName()== "Superadmin" || usuario.getRol_id().getName()== "Admin") */{
			miRol="ROLE_ADMIN";
		}
		
		
		
		var roles = new ArrayList<GrantedAuthority>();
        
        
        roles.add(new SimpleGrantedAuthority(miRol));
        
        
        return new User(usuario.getUsername(), usuario.getPassword(), roles);
		
	}

	@Override
	public Usuario findByUsername(String username) {
		return userDao.findByUsername(username);
	}
	
	
	
	
}
