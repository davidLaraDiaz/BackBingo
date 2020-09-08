package com.progracol.juego.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bingo_param_board")

public class Board implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long board_id;
	private int board_numbers;
	private char status;
	private int created_by;
	private Date last_update_at;
	private int last_update_by;
	private Date deleted_at;
	private int deleted_by;
	private Date created_at;
	private int[] sensor_values;
	
	
	public Board() {
		// TODO Auto-generated constructor stub
	}


	public Long getBoard_id() {
		return board_id;
	}


	public void setBoard_id(Long board_id) {
		this.board_id = board_id;
	}


	public int getBoard_numbers() {
		return board_numbers;
	}


	public void setBoard_numbers(int board_numbers) {
		this.board_numbers = board_numbers;
	}


	public char getStatus() {
		return status;
	}


	public void setStatus(char status) {
		this.status = status;
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

	

	public Date getCreated_at() {
		return created_at;
	}


	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public int[] getSensor_values() {
		return sensor_values;
	}


	public void setSensor_values(int[] sensor_values) {
		this.sensor_values = sensor_values;
	}
	
	
	
}
