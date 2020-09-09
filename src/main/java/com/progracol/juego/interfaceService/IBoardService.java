package com.progracol.juego.interfaceService;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.progracol.juego.model.Board;

public interface IBoardService {

	
	public Page<Board> findAll( Pageable pageable);
	
	public Optional<Board> findById(Long id);
	
	public List<Board> topWinners(List<Integer> bingo);
	
}
