package org.theswimguide.engine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.theswimguide.engine.models.Sponsor;

@Repository
public interface SponsorRepository extends JpaRepository<Sponsor, Integer> {
    
}
