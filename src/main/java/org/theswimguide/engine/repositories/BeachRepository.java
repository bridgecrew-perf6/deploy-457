package org.theswimguide.engine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.theswimguide.engine.models.Beach;

@Repository
public interface BeachRepository extends JpaRepository<Beach, Integer> {
    
}
