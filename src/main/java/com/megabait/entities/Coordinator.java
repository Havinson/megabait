package com.megabait.entities;

import javax.persistence.Entity;

@Entity
public class Coordinator {
	private String firstName;
	private String lastName;
	private int eventsQuant;
	private long id;
	private String email;
	private String password;
	private String telNumber;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEventsQuant() {
		return eventsQuant;
	}

	public void setEventsQuant(int eventsQuant) {
		this.eventsQuant = eventsQuant;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

}
