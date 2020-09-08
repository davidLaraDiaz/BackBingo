package com.progracol.juego.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bingo_param_figure")
public class Figure implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long figure_id;
	private int group_figure_id;
	private String figure_name;
	private boolean[] positions_winner;
	private char status;
	private int created_by;
	private Date last_update_at;
	private int last_update_by;
	private Date deleted_at;
	private int deleted_by;
	private Date created_at;
	private boolean used;
	
	public Figure() {
		// TODO Auto-generated constructor stub
	}

	public Long getFigure_id() {
		return figure_id;
	}

	public void setFigure_id(Long figure_id) {
		this.figure_id = figure_id;
	}

	public int getGroup_figure_id() {
		return group_figure_id;
	}

	public void setGroup_figure_id(int group_figure_id) {
		this.group_figure_id = group_figure_id;
	}

	public String getFigure_name() {
		return figure_name;
	}

	public void setFigure_name(String figure_name) {
		this.figure_name = figure_name;
	}

	public boolean[] getPositions_winner() {
		return positions_winner;
	}

	public void setPositions_winner(boolean[] positions_winner) {
		this.positions_winner = positions_winner;
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

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
