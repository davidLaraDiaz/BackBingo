package com.progracol.juego.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progracol.juego.interfaceService.IFigureService;
import com.progracol.juego.model.Figure;

@RestController
@RequestMapping ("/api")
public class FigureController {
	
	private final Logger log = LoggerFactory.getLogger(FigureController.class);
	
	@Autowired
	private IFigureService figureService;


	@GetMapping("/figure/win")
	public List<Figure> figuresWin(){	
		
		return figureService.findAll();
	}
	
	@PutMapping("/figure/")
	public String winners(){
		List<Integer> bingo = new ArrayList<>();
		
		for(int i = 1; i <= 30; i++) {
			Random random = new Random();
			int balota = random.nextInt(75) + 1;
			bingo.add(balota);
		}
		
		return "";
	}
	
}
