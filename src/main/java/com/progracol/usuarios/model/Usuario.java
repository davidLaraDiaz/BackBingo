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
@Table(name = "bingo_user")
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
	private boolean credencias_expired;
	private String phone;
	private String position;
	private Date created_at;
	private int created_by;
	private Date last_update_at;
	private int last_update_by;
	private Date deleted_at;
	private int deleted_by;
	private String cedula;
	private int customer_id;
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


	public boolean isCredencias_expired() {
		return credencias_expired;
	}


	public void setCredencias_expired(boolean credencias_expired) {
		this.credencias_expired = credencias_expired;
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


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public int getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
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
