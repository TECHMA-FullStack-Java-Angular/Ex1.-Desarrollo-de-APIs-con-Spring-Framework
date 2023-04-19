package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Party;

public interface IPartyDao extends JpaRepository<Party, Integer>{
	
	public List<Party> findByGameId(int gameId);

}
