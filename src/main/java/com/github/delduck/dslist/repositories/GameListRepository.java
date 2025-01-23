package com.github.delduck.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.delduck.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
