package com.meloni.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.meloni.entities.PokemonPic;
import java.util.Optional;

public interface PokemonPicDAO extends JpaRepository<PokemonPic, String> {
    Optional<PokemonPic> findByName(String name);
}
