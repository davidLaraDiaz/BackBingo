package com.progracol.juego.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progracol.juego.dao.FigureRepository;
import com.progracol.juego.interfaceService.IFigureService;
import com.progracol.juego.model.Figure;

@Service
public class FigureService implements IFigureService{
	
	@Autowired
	private FigureRepository figureDao;

	@Override
	public Figure save(Figure figure) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Figure findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Figure> findAll() {
		
		return figureDao.findAll();
	}




	


}
