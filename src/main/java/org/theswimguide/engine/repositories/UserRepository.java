package org.theswimguide.engine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.theswimguide.engine.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
}
