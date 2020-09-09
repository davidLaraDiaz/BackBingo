package com.progracol.juego.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.progracol.juego.model.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long>{

	
	
}
