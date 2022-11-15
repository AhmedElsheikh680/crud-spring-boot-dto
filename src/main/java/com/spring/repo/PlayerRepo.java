package com.spring.repo;

import com.spring.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepo extends JpaRepository<Player, Long> {

    Player findByFirstNameAndLastName(String firstName, String lastName);
}
