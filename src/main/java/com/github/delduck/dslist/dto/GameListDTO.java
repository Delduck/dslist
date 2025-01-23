package com.github.delduck.dslist.dto;

import com.github.delduck.dslist.entities.GameList;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class GameListDTO {

	private Long id;	
	private String name;
	
	public GameListDTO(GameList entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		
	}
	
}
