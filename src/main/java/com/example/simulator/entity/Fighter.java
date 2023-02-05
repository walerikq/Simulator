package com.example.simulator.entity;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Fighter {

    UUID uuid;
    String name;

    List<Pilot> assignedPilotsToTheFighter;

}
