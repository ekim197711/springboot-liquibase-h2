package com.codeinvestigator.springbootliquibase.spacestation;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
public class YamlSpaceStationMapper {
    private SpaceStation spaceStation;
    private String wrapperName;

    public Map<Object, Object> map() {
        Map<Object, Object> wrapper = new HashMap<>();
        Map<Object, Object> map = new HashMap<>();
        Map<Object, Object> spaceStationMap = new HashMap<>();
        Map<Object, Object> captainMap = new HashMap<>();
        spaceStationMap.put("crew", spaceStation.getCrew());

        List<Map<String, Object>> captainsMap = spaceStation.getCaptains().stream()
                .map(c -> {
                    Map<String, Object> capmap = new HashMap<>();
                    capmap.put("name", c.getName());
                    capmap.put("experience", c.getExperience());
                    return capmap;
                }).toList();
        spaceStationMap.put("captains", captainsMap);
        map.put("spacestation", spaceStationMap);
        map.put("dateCreated", LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));

        wrapper.put(wrapperName, map);
        return wrapper;
    }
}
