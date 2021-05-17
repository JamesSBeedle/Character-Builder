package com.BeedleElsmie.CharacterBuilder.Repositories;

import com.BeedleElsmie.CharacterBuilder.Models.Spell;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpellRepository extends JpaRepository<Spell, Long> {
}
