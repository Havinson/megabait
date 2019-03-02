package com.megabait.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megabait.entities.Event;
import com.megabait.entities.Participant;
import com.megabait.exceptions.MegabaitSystemExeption;
import com.megabait.repositories.EventRepository;
import com.megabait.repositories.ParticipantRepository;

@Service
public class AdminServiceImpl implements AdminService {

	public AdminServiceImpl() {
		super();
	}

	@Autowired
	EventRepository eventRepository;

	@Autowired
	ParticipantRepository participantRepository;

	@Override
	public void createEvent(Event event) throws MegabaitSystemExeption {
		if (!(eventRepository.existsById(event.getId()))
				&& (eventRepository.findByName(event.getName()) == null)) {

			eventRepository.save(event);
		} else {
			throw new MegabaitSystemExeption("Event with the same Name or ID already exist");
		}

	}

	/** Must be replaced by deactivate */
	@Override
	public void removeEvent(Event event) {
		eventRepository.delete(event);
	}

	@Override
	public void updateEvent(Event event) {
		eventRepository.saveAndFlush(event);
	}

	@Override
	public void createParticipant(Participant participant) throws MegabaitSystemExeption {
		if (!(participantRepository.existsById(participant.getId()))) {
			participantRepository.save(participant);
		} else {
			throw new MegabaitSystemExeption("Event with the same Name or ID already exist");
		}
	}

	@Override
	public void deactivateParticipant(Participant participant) {

	}

	@Override
	public void activateParticipant(Participant participant) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getParticipantbyId(long participantId) {
		participantRepository.findById(participantId);

	}

	// ??????
	@Override
	public Collection<Event> getAllEventOfParticipant(Participant participant) {

		return null;
//		participant.getPartisipantsEvents();
	}

}
