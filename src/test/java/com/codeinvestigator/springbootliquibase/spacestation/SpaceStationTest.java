package com.codeinvestigator.springbootliquibase.spacestation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.yaml.snakeyaml.Yaml;

import java.util.List;
import java.util.Map;


class SpaceStationTest {

    @Test
    public void yamlStuff() {
        SpaceStation spaceStation = SpaceStation.builder()
                .location("Behind some moon")
                .captains(List.of(
                        SpaceCaptain.builder()
                                .name("Mike")
                                .experience(5)
                                .build(),
                        SpaceCaptain.builder()
                                .name("Inga")
                                .experience(9)
                                .build()
                ))
                .crew(200)
                .build();

        Yaml yaml = new Yaml();
        String stringFromObject = yaml.dumpAsMap(spaceStation);
//        String s2 = yaml.dumpAs(spaceStation, new Tag("spacestuff"), DumperOptions.FlowStyle.BLOCK);
        Assertions.assertNotNull(stringFromObject);
//        System.out.println(stringFromObject);


        Map<Object, Object> spaceStuffMap = YamlSpaceStationMapper.
                builder()
                .spaceStation(spaceStation)
                .wrapperName("spaceStuff")
                .build().map();
        String stringFromStuffMap = yaml.dumpAsMap(spaceStuffMap);
        System.out.println(stringFromStuffMap);
    }


}