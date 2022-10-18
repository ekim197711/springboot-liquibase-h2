package com.codeinvestigator.springbootliquibase.spacestation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class SpaceCaptain {
    private String name;
    private int experience;
}
