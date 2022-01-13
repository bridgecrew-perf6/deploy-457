package org.theswimguide.engine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.theswimguide.engine.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
    
}
