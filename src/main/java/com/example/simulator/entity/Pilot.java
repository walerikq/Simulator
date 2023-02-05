package com.example.simulator.entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Builder
@Data
public class Pilot {

    UUID id;
    Integer age;
    String name;
    String surname;

    List<Fighter> availableFightersList;
    List<Room> availableRooms;

}
