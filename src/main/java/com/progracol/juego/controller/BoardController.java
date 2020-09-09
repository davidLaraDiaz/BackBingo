package com.progracol.juego.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progracol.juego.interfaceService.IBoardService;
import com.progracol.juego.model.Board;

@RestController
@RequestMapping ("/api")
public class BoardController {
	
	private final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private IBoardService boardService;

	@GetMapping("/")
	public String index(){	
		return "Bienvenido";
	}
	
	@GetMapping("/board/page/{page}")
	public Page<Board> index(@PathVariable Integer page){	
		Pageable pageable = PageRequest.of(page, 4);
		return boardService.findAll( pageable );
	}
	
	@PostMapping("/board/topwinners")
	public List<Board> winners(){
		List<Integer> bingo = new ArrayList<>();
		
		for(int i = 1; i <= 30; i++) {
			Random random = new Random();
			int balota = random.nextInt(75) + 1;
			bingo.add(balota);
		}
		
		return boardService.topWinners(bingo);
	}
	
}
