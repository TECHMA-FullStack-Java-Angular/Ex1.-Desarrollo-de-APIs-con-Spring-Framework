package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dto.Join;
import com.example.demo.service.JoinServiceImpl;

@RestController
@RequestMapping("/api")
public class JoinController {

	@Autowired
	JoinServiceImpl joinService;

	@GetMapping("/join")
	public List<Join> showJoin() {
		return joinService.showJoin();
	}

	@PostMapping("/join")
	public Join joinParty(@RequestBody Join join) {

		return joinService.createJoin(join);
	}

	@DeleteMapping("/join/{id}")
	public void exitParty(@PathVariable(name = "id") int id) {
		joinService.deleteJoin(id);
	}

}
