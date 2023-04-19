package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Game;

import com.example.demo.service.GameServiceImpl;

@RestController
@RequestMapping("/api")
public class GameController {

	@Autowired
	GameServiceImpl gameService;

	@GetMapping("/game")
	public List<Game> showGame() {
		return gameService.showGames();
	}

	@PostMapping("/game")
	public Game createGame(@RequestBody Game game) {

		return gameService.createGame(game);
	}

	@PutMapping("/game/{id}")
	public Game updateGame(@PathVariable(name = "id") int id, @RequestBody Game game) {

		Game gameSelected = new Game();
		Game gameUpdated = new Game();

		gameSelected = gameService.findGame(id);
		if (game.getDescription() != null) {
			gameSelected.setDescription(game.getDescription());
			gameUpdated = gameService.updateGame(gameSelected);
		} else if (game.getName() != null) {
			gameSelected.setName(game.getName());
			gameUpdated = gameService.updateGame(gameSelected);
		} else if (game.getParties() != null) {
			gameSelected.setParties(game.getParties());
			gameUpdated = gameService.updateGame(gameSelected);
		}

		else {
			gameUpdated = gameSelected;
		}

		return gameUpdated;
	}

	@DeleteMapping("/game/{id}")
	public void deleteGame(@PathVariable(name = "id") int id) {
		gameService.deleteGame(id);
	}

}
