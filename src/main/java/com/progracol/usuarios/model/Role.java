package com.progracol.usuarios.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "bingo_rol")
public class Role implements Serializable{
	
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long rol_id;
	private String name;
	private char status;
	
	
	
	public Role() {
		// TODO Auto-generated constructor stub
	}


	

	public Long getRol_id() {
		return rol_id;
	}




	public void setRol_id(Long rol_id) {
		this.rol_id = rol_id;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public char getStatus() {
		return status;
	}


	public void setStatus(char status) {
		this.status = status;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

	

}
