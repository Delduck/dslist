package com.github.delduck.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.delduck.dslist.dto.GameDTO;
import com.github.delduck.dslist.dto.GameMinDTO;
import com.github.delduck.dslist.service.GameService;

@RestController
@RequestMapping("/games")
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.listAll();
		return result;		
	}
	
	@GetMapping(value = "/{gameId}")
	public GameDTO findById(@PathVariable Long gameId) {
		return gameService.findById(gameId);
	}
}
