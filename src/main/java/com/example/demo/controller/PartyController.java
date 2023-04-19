package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Game;
import com.example.demo.dto.Party;

import com.example.demo.service.PartyServiceImpl;

@RestController
@RequestMapping("/api")
public class PartyController {

	@Autowired
	PartyServiceImpl partyService;


	@GetMapping("/party")
	public List<Party> showParties() {
		return partyService.showParty();

	}

	@PostMapping("/party")
	public Party createParty(@RequestBody Party party) {

		return partyService.createParty(party);
	}

	@GetMapping("/party/{game}")
	public List<Party> findParty(@PathVariable(name = "game") Game game) {
		Game finder = new Game();

		return game.getParties();
	}

}
