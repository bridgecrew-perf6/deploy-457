package org.theswimguide.engine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.theswimguide.engine.models.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {
    
}
