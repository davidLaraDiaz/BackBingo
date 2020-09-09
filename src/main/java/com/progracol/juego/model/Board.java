package com.progracol.juego.model;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.array.ListArrayType;

@Entity(name = "Board")
@Table(name = "bingo_param_board")
@TypeDef(
	    name = "list-array",
	    typeClass = ListArrayType.class
	)
public class Board implements Serializable{
	


	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long board_id;
	
	
	@Type(type = "list-array")
    @Column(
        name = "board_numbers",
        columnDefinition = "integer[]"
    )
    private List<Integer> board_numbers;

	
	
	private char status;
	
	
	
	


	public List<Integer> getBoard_numbers() {
		return board_numbers;
	}


	public void setBoard_numbers(List<Integer> board_numbers) {
		this.board_numbers = board_numbers;
	}


	public Board() {
		// TODO Auto-generated constructor stub
	}


	public Long getBoard_id() {
		return board_id;
	}


	public void setBoard_id(Long board_id) {
		this.board_id = board_id;
	}



	public char getStatus() {
		return status;
	}


	public void setStatus(char status) {
		this.status = status;
	}


		
	
}
