package org.ironhack.lab308.exercise2.repository;

import org.ironhack.lab308.exercise2.model.Conference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferenceRepository extends JpaRepository<Conference, Integer> {
}
