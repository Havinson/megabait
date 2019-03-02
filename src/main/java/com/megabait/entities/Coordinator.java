package com.megabait.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Coordinator {
	private String firstName;
	private String lastName;
	private int eventsQuant;
	@Id
	private long id;
	private String email;
	private String password;
	private String telNumber;
	@ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private List<Event> events = new ArrayList<>();

	public Coordinator() {

	}

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

	@Override
	public String toString() {
		return "Coordinator [firstName=" + firstName + ", lastName=" + lastName + ", eventsQuant=" + eventsQuant
				+ ", id=" + id + ", email=" + email + ", password=" + password + ", telNumber=" + telNumber + "]";
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

}
