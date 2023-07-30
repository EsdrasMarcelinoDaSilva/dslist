package com.esdrasdev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.esdrasdev.dslist.dto.GameListDTO;
import com.esdrasdev.dslist.dto.GameMinDTO;
import com.esdrasdev.dslist.entities.GameList;
import com.esdrasdev.dslist.repositories.GameListRepository;

@Component
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();		
	
	}
}
