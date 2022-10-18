package com.codeinvestigator.springbootliquibase.spacestation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SpaceStation {

    private List<SpaceCaptain> captains;
    private String location;
    private int crew;
}
