package com.progracol.juego.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.progracol.juego.model.Figure;

@Repository
public interface FigureRepository extends JpaRepository<Figure, Long>{

	@Query(value = "select figure_id, group_figure_id, figure_name, positions_winner::text[], used from bingo_param_figure", nativeQuery = true)
	public List<Figure> getWin();
}
