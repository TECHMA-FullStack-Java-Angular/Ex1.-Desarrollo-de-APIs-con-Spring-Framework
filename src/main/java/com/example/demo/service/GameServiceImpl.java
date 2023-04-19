package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IGameDao;
import com.example.demo.dto.Game;
import com.example.demo.dto.Party;

@Service
public class GameServiceImpl implements IGameService {
	
	@Autowired
	IGameDao iGame;

	@Override
	public List<Game> showGames() {
		
		return iGame.findAll();
	}

	@Override
	public Game createGame(Game game) {
		
		return iGame.save(game);
	}

	@Override
	public Game findGame(int id) {
		
		return iGame.findById(id).get();
	}

	@Override
	public Game updateGame(Game game) {
		
		return iGame.save(game);
	}

	@Override
	public void deleteGame(int id) {
		iGame.deleteById(id);
		
	}

	@Override
	public List<Party> findParty(Game game) {

		return game.getParties();
		

	}
}
