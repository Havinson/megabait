package com.megabait.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megabait.entities.Coordinator;

@Repository
public interface CoordinatorRepository extends JpaRepository<Coordinator, Long> {

}
