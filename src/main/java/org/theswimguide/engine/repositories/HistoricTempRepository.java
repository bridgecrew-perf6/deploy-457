package org.theswimguide.engine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.theswimguide.engine.models.HistoricTemp;

@Repository
public interface HistoricTempRepository extends JpaRepository<HistoricTemp, Integer> {
    
}
