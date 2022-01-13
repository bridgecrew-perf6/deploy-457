package org.theswimguide.engine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.theswimguide.engine.models.Direction;

@Repository
public interface DirectionRepository extends JpaRepository<Direction, Integer> {
    
}
