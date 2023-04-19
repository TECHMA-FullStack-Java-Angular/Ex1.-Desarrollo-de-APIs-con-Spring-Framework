package com.example.demo.service;


import java.util.List;

import com.example.demo.dto.Message;

public interface IMessageService {

	// Basic CRUD methods

	public List<Message> showMessages(); //get All 

	public Message createMessage(Message message); // CREATE

	public Message findMessage(int id); // READ

	public Message updateMessage(Message message); // UPDATE

	public void deleteMessage(int id);// DELETE

}
