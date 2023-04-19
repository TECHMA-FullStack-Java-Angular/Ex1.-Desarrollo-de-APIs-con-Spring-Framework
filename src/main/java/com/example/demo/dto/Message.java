package com.example.demo.dto;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "messages")
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String message;

	@Column(name = "message_date")
	private Date date;

	@ManyToOne
	@JoinColumn(name = "user_name") // a chat is written by 1 user
	private User userName;

	@ManyToOne
	@JoinColumn(name = "party") // the messages belongs to 1 party
	private Party party;

	// Constructors

	public Message(int id, String message, Date date, User userName, Party party) {
		super();
		this.id = id;
		this.message = message;
		this.date = date;
		this.userName = userName;
		this.party = party;
	}

	public Message() {
		super();
	}

	// getters & setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User getUserName() {
		return userName;
	}

	public void setUserName(User userName) {
		this.userName = userName;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + ", date=" + date + ", userName=" + userName + ", party="
				+ party + "]";
	}

}
