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
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "user_name")
	private String name;

	@Column(name = "user_password")
	private String password;

	@Column(name = "user_email")
	private String email;

	@Column(name = "user_stream")
	private String streamName;

	@OneToMany
	@JoinColumn(name = "creator") // an user can create many parties
	private List<Party> parties;

	@OneToMany
	@JoinColumn(name = "user_name") // an user can make many joins
	private List<Join> joins;

	@OneToMany
	@JoinColumn(name = "user_name") // an user can write many messages
	private List<Message> messages;

	// constructors

	public User(int id, String name, String password, String email, String streamName, List<Party> parties,
			List<Join> joins, List<Message> messages) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.streamName = streamName;
		this.parties = parties;
		this.joins = joins;
		this.messages = messages;
	}

	public User() {
		super();
	}

	// Getters & setters

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user_name")
	public List<Message> getMessages() {
		return messages;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user_name")
	public List<Join> getJoins() {
		return joins;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "creator")
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreamName() {
		return streamName;
	}

	public void setStreamName(String streamName) {
		this.streamName = streamName;
	}

	public void setParties(List<Party> parties) {
		this.parties = parties;
	}

	public void setJoins(List<Join> joins) {
		this.joins = joins;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", streamName="
				+ streamName + ", parties=" + parties + ", joins=" + joins + ", messages=" + messages + "]";
	}

}
