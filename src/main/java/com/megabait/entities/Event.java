package com.megabait.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private Date date;
	private EventType type;
	private String place;
	private double price;
	private int participantQuantity;
	@ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "events")
	private List<Coordinator> coordinators = new ArrayList<>();
	@ManyToMany(mappedBy = "partisipantsEvents")
	private List<Participant> participants = new ArrayList<>();;

	public Event() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getParticipantQuantity() {
		return participantQuantity;
	}

	public void setParticipantQuantity(int participantQuantity) {
		this.participantQuantity = participantQuantity;
	}

	public List<Coordinator> getCoordinators() {
		return coordinators;
	}

	public void setCoordinators(List<Coordinator> coordinators) {
		this.coordinators = coordinators;
	}

	public List<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

}
