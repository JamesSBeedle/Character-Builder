package com.BeedleElsmie.CharacterBuilder.Components;


import com.BeedleElsmie.CharacterBuilder.Models.*;
import com.BeedleElsmie.CharacterBuilder.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    EquipmentRepository equipmentRepository;

    @Autowired
    FeatRepository featRepository;

    @Autowired
    RaceRepository raceRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    SkillRepository skillRepository;

    @Autowired
    SpellRepository spellRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {

        Equipment equipment1 = new Equipment("Long Sword", "longsword", "longsword.com");
        Equipment equipment2 = new Equipment("Short Sword", "shortsword", "shortsword.com");

        Feat feat1 = new Feat("Dual Wielding", "dualwield", "dualwield.com");
        Feat feat2 = new Feat("Bash", "bash", "bash.com");

        Race race1 = new Race("Dwaf", "dwarf", "dwarf.com");
        Race race2 = new Race("Elf", "elf", "elf.com");
        
        Role role1 = new Role("Cleric", "cleric", "cleric.com");
        Role role2 = new Role("Fighter", "fighter", "fighter.com");

        Skill skill1 = new Skill("Acrobatics", "acrobatics", "acrobatics.com");
        Skill skill2 = new Skill("Climb", "climb", "climb.com");

        Spell spell1 = new Spell ("Magic Missile", "magic missile", "magicmissile.com");
        Spell spell2 = new Spell("Eldritch Blast", "eldritch blast", "eldritchblast.com");
    }
}
