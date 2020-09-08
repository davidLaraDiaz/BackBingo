package com.progracol.juego.interfaceService;

import java.util.List;

import com.progracol.juego.model.Figure;



public interface IFigureService {

	
	public Figure save( Figure figure);
	
	public Figure findById(Long id);
	
	public List<Figure> findAll();
	
}
