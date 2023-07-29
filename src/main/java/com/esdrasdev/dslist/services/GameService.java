package com.esdrasdev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.esdrasdev.dslist.GameMinDTO;
import com.esdrasdev.dslist.entities.Game;
import com.esdrasdev.dslist.repositories.GameRepository;

@Component
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	public List<GameMinDTO> findAl(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();		
	
	}
}
