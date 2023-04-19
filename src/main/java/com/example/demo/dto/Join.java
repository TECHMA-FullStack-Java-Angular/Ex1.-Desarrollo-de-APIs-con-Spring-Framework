package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "participate")
public class Join {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "party_name") // A join is made to one party
	private Party partyName;

	@ManyToOne
	@JoinColumn(name = "user_name") // A join is made from one user
	private User userName;

	// constructors

	public Join(int id, Party partyName, User userName) {
		super();
		this.id = id;
		this.partyName = partyName;
		this.userName = userName;
	}

	public Join() {
		super();
	}

	// getters & setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Party getPartyName() {
		return partyName;
	}

	public void setPartyName(Party partyName) {
		this.partyName = partyName;
	}

	public User getUserName() {
		return userName;
	}

	public void setUserName(User userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Join [id=" + id + ", partyName=" + partyName + ", userName=" + userName + "]";
	}

}
