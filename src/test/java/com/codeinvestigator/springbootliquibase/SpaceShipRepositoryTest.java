package com.codeinvestigator.springbootliquibase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpaceShipRepositoryTest {
    @Autowired
    SpaceShipRepository spaceShipRepository;

    @Test
    void tryStuff() {
        long before = spaceShipRepository.count();
        spaceShipRepository.save(
                SpaceShip.builder()
                        .type("Round")
                        .captain("Mike")
                        .fuel(99)
                        .build());
        spaceShipRepository.save(
                SpaceShip.builder()
                        .type("Roundish")
                        .captain("Jack")
                        .fuel(55)
                        .build());


        spaceShipRepository.findAll().forEach(System.out::println);
        Assertions.assertEquals(before + 2, spaceShipRepository.count());
    }

}