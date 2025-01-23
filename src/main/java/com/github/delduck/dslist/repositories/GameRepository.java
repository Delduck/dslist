package com.github.delduck.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.delduck.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
