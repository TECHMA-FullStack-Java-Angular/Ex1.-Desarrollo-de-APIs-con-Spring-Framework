package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dao.IPartyDao;

import com.example.demo.dto.Party;

@Service
public class PartyServiceImpl implements IPartyService{
	
	@Autowired
	IPartyDao iParty;
	

	@Override
	public List<Party> showParty() {
		
		return iParty.findAll();
	}

	@Override
	public Party createParty(Party party) {
		
		return iParty.save(party);
	}

	@Override
	public Party findParty(int id) {
		
		return iParty.findById(id).get();
	}

	@Override
	public Party updateParty(Party party) {
		
		return iParty.save(party);
	}

	@Override
	public void deleteParty(int id) {
		iParty.deleteById(id);
		
	}

	@Override
	public List<Party> findByGameId(int gameId) {
		
		return iParty.findByGameId(gameId);
	}

}
