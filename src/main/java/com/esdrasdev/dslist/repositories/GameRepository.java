package com.esdrasdev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esdrasdev.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long>{

}
