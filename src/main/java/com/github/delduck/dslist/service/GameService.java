package com.github.delduck.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.delduck.dslist.dto.GameDTO;
import com.github.delduck.dslist.dto.GameMinDTO;
import com.github.delduck.dslist.entities.Game;
import com.github.delduck.dslist.projections.GameMinProjection;
import com.github.delduck.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> listAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(   
				x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long gameId) {
		Game result = gameRepository.findById(gameId).get();
		return new GameDTO(result);
	}
	
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		
		List<GameMinDTO> dto = result.stream().map( 
				x -> new GameMinDTO(x)).toList();
		return dto;
	}

}
