package com.github.delduck.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.github.delduck.dslist.entities.Game;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class GameDTO {
	
	private Long id;	
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	// Lógica para copiar os dados da entidade  para DTO 'representation model' 
	public GameDTO(Game entity) {
		BeanUtils.copyProperties(entity, this); //copitando tudo da entidade para este objeto - nomes devem ser iguais
	}
	
	
}
