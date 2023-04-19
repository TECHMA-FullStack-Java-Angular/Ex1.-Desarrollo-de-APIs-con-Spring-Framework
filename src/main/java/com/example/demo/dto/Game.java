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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="games")
public class Game {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="game_name")
	private String name;
	
	@Column(name="game_description")
	private String description;
	
	@OneToMany
	@JoinColumn(name="game")//a game can have many parties
	private List<Party> parties;

	
	//Constructors
	
	public Game(int id, String name, String description, List<Party> parties) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.parties = parties;
	}

	public Game() {
		super();
	}
	
	//getters & setters
	

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "game")
	public List<Party> getParties() {
		return parties;
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

	public void setParties(List<Party> parties) {
		this.parties = parties;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", description=" + description + ", parties=" + parties + "]";
	}
	
	
	
	

}
