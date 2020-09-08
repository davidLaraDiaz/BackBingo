package com.progracol.usuarios.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
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
	
	@Column(length = 20)
	private String name;
	private char status;
	private Date created_at;
	private int created_by;
	private Date last_update_at;
	private int last_update_by;
	private Date deleted_at;
	private int deleted_by;
	private int readonly;
	
	
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


	public Date getCreated_at() {
		return created_at;
	}


	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}


	public int getCreated_by() {
		return created_by;
	}


	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}


	public Date getLast_update_at() {
		return last_update_at;
	}


	public void setLast_update_at(Date last_update_at) {
		this.last_update_at = last_update_at;
	}


	public int getLast_update_by() {
		return last_update_by;
	}


	public void setLast_update_by(int last_update_by) {
		this.last_update_by = last_update_by;
	}


	public Date getDeleted_at() {
		return deleted_at;
	}


	public void setDeleted_at(Date deleted_at) {
		this.deleted_at = deleted_at;
	}


	public int getDeleted_by() {
		return deleted_by;
	}


	public void setDeleted_by(int deleted_by) {
		this.deleted_by = deleted_by;
	}


	public int getReadonly() {
		return readonly;
	}


	public void setReadonly(int readonly) {
		this.readonly = readonly;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

	

}
