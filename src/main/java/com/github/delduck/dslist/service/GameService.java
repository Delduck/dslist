package com.github.delduck.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.delduck.dslist.dto.GameDTO;
import com.github.delduck.dslist.dto.GameMinDTO;
import com.github.delduck.dslist.entities.Game;
import com.github.delduck.dslist.repositories.GameRepository;

//precisamos 'registrar' essa CLASSE como um componente no SPRING - Framework que vai gerenciar pra gente  - @Component  //registra
@Service  //apelido, faz a mesma coisa
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> listAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(  //convertemos 
				x -> new GameMinDTO(x)).toList();   //map -> transforma objetos de uma coisa para outra
		return dto;
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long gameId) {
		Game result = gameRepository.findById(gameId).get();
		return new GameDTO(result);
	}

}
