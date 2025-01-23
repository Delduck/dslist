package com.github.delduck.dslist.dto;

import com.github.delduck.dslist.entities.Game;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class GameMinDTO {


	private Long id;	
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	//construtor que recebe a entidade, copiando os dados da entidade
	public GameMinDTO(Game entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}
	
	
}
