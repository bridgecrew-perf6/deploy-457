package org.theswimguide.engine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.theswimguide.engine.models.Frequency;

@Repository
public interface FrequencyRepository extends JpaRepository<Frequency, Integer> {
    
}
