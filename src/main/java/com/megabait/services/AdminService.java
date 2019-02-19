package com.megabait.services;

import java.util.Collection;

import com.megabait.entities.Event;
import com.megabait.entities.Participant;
import com.megabait.exceptions.MegabaitSystemExeption;

public interface AdminService {

	public void createEvent(Event event) throws MegabaitSystemExeption;

	public void removeEvent(Event event);

	public void updateEvent(Event event);

	public void createParticipant(Participant participant) throws MegabaitSystemExeption;

	public void deactivateParticipant(Participant participant);

	public void activateParticipant(Participant participant);

	public void getParticipantbyId(long participantId);

	public Collection<Event> getAllEventOfParticipant(Participant participant);

}
