package com.progracol.juego.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.progracol.juego.dao.BoardRepository;
import com.progracol.juego.interfaceService.IBoardService;
import com.progracol.juego.model.Board;

@Service
public class BoardService implements IBoardService{
	
	@Autowired
	private BoardRepository boardDao;

	@Override
	@Transactional (readOnly = true)
	public Page<Board> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return boardDao.findAll(pageable);
	}

	@Override
	public Optional<Board> findById(Long id) {
		// TODO Auto-generated method stub
		return boardDao.findById(id);
	}

	@Override
	public List<Board> topWinners(List<Integer> bingo) {
		
		List<Board> winners = new ArrayList<>();
		List<Board> allBoards = boardDao.findAll();
		int index = 0;
		
		while (winners.size() < 100 || index < allBoards.size()-1) {
			
			Board board = allBoards.get(index);
			boolean isWin=false;
			
			for (int item : board.getBoard_numbers() ) {
				if (bingo.contains(item)) {
					isWin=true;
				}else {
					isWin=false;
					break;
				}
			}
			
			if (isWin) {
				winners.add(board);
			}
			
			index++;
			
		}
		
		
		return winners;
	}
	


}
