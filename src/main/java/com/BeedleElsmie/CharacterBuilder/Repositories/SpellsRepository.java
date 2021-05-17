package com.BeedleElsmie.CharacterBuilder.Repositories;

import com.BeedleElsmie.CharacterBuilder.Models.Spells;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpellsRepository extends JpaRepository<Spells, Long> {
}
