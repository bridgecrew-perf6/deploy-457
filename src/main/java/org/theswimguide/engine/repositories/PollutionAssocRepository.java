package org.theswimguide.engine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.theswimguide.engine.models.PollutionAssoc;
import org.theswimguide.engine.models.PollutionAssocKey;

@Repository
public interface PollutionAssocRepository extends JpaRepository<PollutionAssoc, PollutionAssocKey> {
    
}
