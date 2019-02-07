package com.megabait.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Event {
	private long id;
	private String name;
	private Date date;
	private EventType type;
	private String place;
	private double price;
	private int participantQuantity;
	private Coordinator coordinator;

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

	public Coordinator getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(Coordinator coordinator) {
		this.coordinator = coordinator;
	}
}
