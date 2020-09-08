package com.progracol.juego.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.progracol.juego.model.Board;

@Repository
public interface BoardRepository extends CrudRepository<Board, Long>{

	
	
}
