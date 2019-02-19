package com.megabait.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megabait.entities.Event;
import com.megabait.entities.Participant;
import com.megabait.exceptions.MegabaitSystemExeption;
import com.megabait.repositories.EventRepositoryDAO;
import com.megabait.repositories.ParticipantRepositoriDAO;

@Service
public class AdminServiceImpl implements AdminService {

	public AdminServiceImpl() {
		super();
	}

	@Autowired
	EventRepositoryDAO eventRepositoryDAO;

	@Autowired
	ParticipantRepositoriDAO participantRepositoryDAO;

	@Override
	public void createEvent(Event event) throws MegabaitSystemExeption {
		if (!(eventRepositoryDAO.existsById(event.getId()))
				&& (eventRepositoryDAO.findByName(event.getName()) == null)) {

			eventRepositoryDAO.save(event);
		} else {
			throw new MegabaitSystemExeption("Event with the same Name or ID already exist");
		}

	}

	@Override
	public void removeEvent(Event event) {
		eventRepositoryDAO.delete(event);
	}

	@Override
	public void updateEvent(Event event) {
		eventRepositoryDAO.saveAndFlush(event);
	}

	@Override
	public void createParticipant(Participant participant) throws MegabaitSystemExeption {
		if (!(participantRepositoryDAO.existsById(participant.getId()))) {
			participantRepositoryDAO.save(participant);
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
		participantRepositoryDAO.findById(participantId);

	}

	// ??????
	@Override
	public Collection<Event> getAllEventOfParticipant(Participant participant) {

		return participant.getParticipatedInEvents();
	}

}
