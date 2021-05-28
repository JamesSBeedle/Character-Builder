//package com.BeedleElsmie.CharacterBuilder.Components;
//
//
//import com.BeedleElsmie.CharacterBuilder.Models.*;
//import com.BeedleElsmie.CharacterBuilder.Repositories.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DataLoader implements ApplicationRunner {
//
//    @Autowired
//    EquipmentRepository equipmentRepository;
//
//    @Autowired
//    FeatRepository featRepository;
//
//    @Autowired
//    RaceRepository raceRepository;
//
//    @Autowired
//    RoleRepository roleRepository;
//
//    @Autowired
//    SkillRepository skillRepository;
//
//    @Autowired
//    SpellRepository spellRepository;
//
//    public DataLoader(){
//
//    }
//
//    public void run(ApplicationArguments args) {
//
//        Equipment equipment1 = new Equipment("Long Sword", "longsword", "longsword.com");
//        equipmentRepository.save(equipment1);
//        Equipment equipment2 = new Equipment("Short Sword", "shortsword", "shortsword.com");
//        equipmentRepository.save(equipment2);
//
//        Feat feat1 = new Feat("Dual Wielding", "dualwield", "dualwield.com");
//        featRepository.save(feat1);
//        Feat feat2 = new Feat("Bash", "bash", "bash.com");
//        featRepository.save(feat2);
//
//        Race race1 = new Race("Dwaf", "dwarf", "dwarf.com");
//        raceRepository.save(race1);
//        Race race2 = new Race("Elf", "elf", "elf.com");
//        raceRepository.save(race2);
//
//        Role.java role1 = new Role.java("Cleric", "cleric", "cleric.com");
//        roleRepository.save(role1);
//        Role.java role2 = new Role.java("Fighter", "fighter", "fighter.com");
//        roleRepository.save(role2);
//
//        Skill skill1 = new Skill("Acrobatics", "acrobatics", "acrobatics.com");
//        skillRepository.save(skill1);
//        Skill skill2 = new Skill("Climb", "climb", "climb.com");
//        skillRepository.save(skill2);
//
//        Spell spell1 = new Spell ("Magic Missile", "magic missile", "magicmissile.com");
//        spellRepository.save(spell1);
//        Spell spell2 = new Spell("Eldritch Blast", "eldritch blast", "eldritchblast.com");
//        spellRepository.save(spell2);
//    }
//}
