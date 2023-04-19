package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import jakarta.persistence.Table;

@Entity
@Table(name = "parties")
public class Party {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "party_name")
	private String name;

	@Column(name = "party_description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "game") // a party is created for 1 game
	private Game game;

	@ManyToOne
	@JoinColumn(name = "creator") // a party is created by 1 user
	private User creator;

	@OneToMany
	@JoinColumn(name = "party_name") // a party have many joins
	private List<Join> joins;

	@OneToMany
	@JoinColumn(name = "party") // an party can have many messages
	private List<Message> messages;

	// Constructors

	public Party(int id, String name, String description, Game game, User creator, List<Join> joins,
			List<Message> messages) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.game = game;
		this.creator = creator;
		this.joins = joins;
		this.messages = messages;
	}

	public Party() {
		super();
	}

	// Getters & Setters

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "party_name")
	public List<Join> getJoins() {
		return joins;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "party")
	public List<Message> getMessages() {
		return messages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public void setJoins(List<Join> joins) {
		this.joins = joins;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	@Override
	public String toString() {
		return "Party [id=" + id + ", name=" + name + ", description=" + description + ", game=" + game + ", creator="
				+ creator + ", joins=" + joins + ", messages=" + messages + "]";
	}

}
