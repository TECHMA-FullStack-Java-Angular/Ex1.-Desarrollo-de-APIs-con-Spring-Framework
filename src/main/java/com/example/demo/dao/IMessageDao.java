package com.example.demo.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Message;

public interface IMessageDao extends JpaRepository<Message, Integer>{
	
	public List<Message> findMessagePartyById(int partyId);

}
