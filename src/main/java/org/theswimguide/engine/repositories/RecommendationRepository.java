package org.theswimguide.engine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.theswimguide.engine.models.Recommendation;
import org.theswimguide.engine.models.RecommendationKey;

@Repository
public interface RecommendationRepository extends JpaRepository<Recommendation, RecommendationKey> {
    
}
