package com.progracol.juego.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.array.StringArrayType;



@Entity(name = "Figure")
@Table(name = "bingo_param_figure")
@TypeDef(
	    name = "string-array",
	    typeClass = StringArrayType.class
	)

public class Figure implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long figure_id;
	private int group_figure_id;
	private String figure_name;
	@Type(type = "string-array")
    @Column(
        name = "positions_winner",
        columnDefinition = "boolean[]"
    )
	private Boolean[] positions_winner;
	
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

	

	public Boolean[] getPositions_winner() {
		return positions_winner;
	}

	public void setPositions_winner(Boolean[] positions_winner) {
		this.positions_winner = positions_winner;
	}

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}


	
	
	
	
	
}
