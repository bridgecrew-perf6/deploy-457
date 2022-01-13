package org.theswimguide.engine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.theswimguide.engine.models.Pollution;

@Repository
public interface PollutionRepository extends JpaRepository<Pollution, Integer> {
    
}
