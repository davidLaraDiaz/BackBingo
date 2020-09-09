package com.progracol.usuarios.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name = "bingo_users")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long user_id;
	private String names;
	private String last_names;
	private String username;
	private String img_url;
	private String password;
	@ManyToOne
    @JoinColumn(name = "rol_id")
	private Role rol_id;
	private char status;
	private boolean expired;
	private boolean locked;
	private boolean credrencials_expired;
	private String phone;
	private String position;
	private String cedula;
	private boolean preregister;
	private Date nacimiento;
	private int maxrecharge;
	
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}


	public Long getUser_id() {
		return user_id;
	}


	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}


	public String getNames() {
		return names;
	}


	public void setNames(String names) {
		this.names = names;
	}


	public String getLast_names() {
		return last_names;
	}


	public void setLast_names(String last_names) {
		this.last_names = last_names;
	}
	

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getImg_url() {
		return img_url;
	}


	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Role getRol_id() {
		return rol_id;
	}


	public void setRol_id(Role rol_id) {
		this.rol_id = rol_id;
	}


	public char getStatus() {
		return status;
	}


	public void setStatus(char status) {
		this.status = status;
	}


	public boolean isExpired() {
		return expired;
	}


	public void setExpired(boolean expired) {
		this.expired = expired;
	}


	public boolean isLocked() {
		return locked;
	}


	public void setLocked(boolean locked) {
		this.locked = locked;
	}


	


	public boolean isCredrencials_expired() {
		return credrencials_expired;
	}


	public void setCredrencials_expired(boolean credrencials_expired) {
		this.credrencials_expired = credrencials_expired;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public boolean isPreregister() {
		return preregister;
	}


	public void setPreregister(boolean preregister) {
		this.preregister = preregister;
	}


	public Date getNacimiento() {
		return nacimiento;
	}


	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}


	public int getMaxrecharge() {
		return maxrecharge;
	}


	public void setMaxrecharge(int maxrecharge) {
		this.maxrecharge = maxrecharge;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
