package com.esdrasdev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esdrasdev.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long>{

}
