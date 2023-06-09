package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IMessageDao;
import com.example.demo.dto.Message;

@Service
public class MessageServiceImpl implements IMessageService{
	
	@Autowired
	IMessageDao iMessage;

	@Override
	public Message createMessage(Message message) {
		
		return iMessage.save(message);
	}

	@Override
	public Message updateMessage(Message message) {
		
		return iMessage.save(message);
	}

	@Override
	public void deleteMessage(int id) {
		iMessage.deleteById(id);
		
	}

	@Override
	public List<Message> showMessages() {
		
		return iMessage.findAll();
	}

	@Override
	public Message findMessage(int id) {
		
		return iMessage.findById(id).get();
	}

	@Override
	public List<Message> findMessagePartyById(int partyId) {
		
		return iMessage.findMessagePartyById(partyId);
	}

}
