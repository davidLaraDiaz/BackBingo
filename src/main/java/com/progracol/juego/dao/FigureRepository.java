package com.progracol.juego.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.progracol.juego.model.Figure;

@Repository
public interface FigureRepository extends CrudRepository<Figure, Long>{

}
