package com.megabait.services;

import java.util.Collection;

import com.megabait.entities.Event;

public interface ParticipantService {

	public Collection<Event> getAllEvent();

	public Collection<Event> getMyEvent();

	public void subscribeToEvent(Event event);

	public void unSubscribeToEvent(Event event);

}
