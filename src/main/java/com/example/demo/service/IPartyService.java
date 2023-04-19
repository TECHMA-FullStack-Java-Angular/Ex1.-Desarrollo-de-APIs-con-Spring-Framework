package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Game;
import com.example.demo.dto.Party;



public interface IPartyService {
	
	//Basic CRUD methods
	
			public List<Party> showParty(); //get All 
			
			public Party createParty(Party party);	//CREATE
			
			public Party findParty(int id); // READ
			
			public Party updateParty(Party party); // UPDATE
			
			public void deleteParty(int id);//  DELETE

}
