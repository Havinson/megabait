package com.megabait.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megabait.entities.Event;

@Repository
public interface EventRepositoryDAO extends JpaRepository<Event, Long> {

	public Event findByName(String name);

	// Check and if needed replace by JPQL Query
	public Collection<Event> findAllParticipantById(long id);

}
