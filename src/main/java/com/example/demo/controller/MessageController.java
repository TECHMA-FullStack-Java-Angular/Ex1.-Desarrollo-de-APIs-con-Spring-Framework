package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Message;

import com.example.demo.service.MessageServiceImpl;

@RestController
@RequestMapping("/api")
public class MessageController {

	@Autowired
	MessageServiceImpl messageService;

	@GetMapping("/message")
	public List<Message> listarPieza() {
		return messageService.showMessages();
	}
	
	@GetMapping("/message/{id}")
	public List<Message> showPartyMessagesById(@PathVariable(name = "id") int id){
		return messageService.findPartyMessageById(id);
		
	}

	@PostMapping("/message")
	public Message createMessage(@RequestBody Message message) {

		return messageService.createMessage(message);
	}

	@PutMapping("/message/{id}")
	public Message updateMessage(@PathVariable(name = "id") int id, @RequestBody Message message) {

		Message selectedMessage = new Message();
		Message updatedMessage = new Message();

		selectedMessage = messageService.findMessage(id);

		selectedMessage.setMessage(message.getMessage());
		selectedMessage.setDate(message.getDate());
		

		updatedMessage = messageService.updateMessage(selectedMessage);

		return updatedMessage;
	}

	@DeleteMapping("/message/{id}")
	public void deleteMessage(@PathVariable(name = "id") int id) {
		messageService.deleteMessage(id);
	}

}
