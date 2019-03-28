package com.megabait.services;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megabait.entities.Event;
import com.megabait.entities.Participant;
import com.megabait.exceptions.MegabaitSystemExeption;
import com.megabait.repositories.EventRepository;
import com.megabait.repositories.ParticipantRepository;

@Service
public class ParticipantServiceImpl implements ParticipantService {

	private Participant currentParticipant;

	@Autowired
	private EventRepository eventRepositoryDAO;

	@Autowired
	private ParticipantRepository participantRepositoryDAO;

	public Participant getCurrentParticipant() {
		return currentParticipant;
	}

	public void setCurrentParticipant(Participant currentParticipant) {
		this.currentParticipant = currentParticipant;
	}

	@Override
	public Collection<Event> getAllEvent() {

		return eventRepositoryDAO.findAll();
	}

	@Override
	public Collection<Event> getMyEvent() {
		return eventRepositoryDAO.findAllParticipantById(currentParticipant.getId());
	}

	/**
	 * Gets collection of participants from received event, adds current participant
	 * to the collection and receives updated Collection.
	 * 
	 * @param Event
	 *            event update Collection of Participants with added participant
	 * 
	 */
	@Override
	public void subscribeToEvent(Event event) {
		List<Participant> updatedParticipantList = event.getParticipants();
		updatedParticipantList.add(currentParticipant);
		event.setParticipants(updatedParticipantList);
	}

	/**
	 * Removes participant from participants list of the received event. (Check if
	 * contains).
	 * 
	 * @param Event event
	 *            
	 */
	@Override
	public void unSubscribeToEvent(Event event) throws MegabaitSystemExeption {

		List<Participant> updatedParticipantList = event.getParticipants();
		if (updatedParticipantList.contains(currentParticipant)) {
			updatedParticipantList.remove(currentParticipant);
			event.setParticipants(updatedParticipantList);
		} else
			throw new MegabaitSystemExeption("Can`t unsubscribe. You have no subscription to this event");
	}

}
