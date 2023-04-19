package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Game;
import com.example.demo.dto.Party;



public interface IGameService {
	
	//Basic CRUD methods
	
	public List<Game> showGames(); //get All 
	
	public Game createGame(Game game);	//CREATE
	
	public Game findGame(int id); // READ
	
	public Game updateGame(Game game); // UPDATE
	
	public void deleteGame(int id);//  DELETE
	
	
	public List<Party> findParty(Game game); 
}
