package com.example.simulator.service;


import com.example.simulator.entity.Fighter;
import com.example.simulator.entity.Pilot;
import com.example.simulator.repository.FighterRepo;
import com.example.simulator.repository.PilotRepo;
import com.example.simulator.repository.RoomRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class SpaceService {

    private final PilotRepo pilotRepo;
    private final FighterRepo fighterRepo;
    private final RoomRepo roomRepo;

    public List<Pilot> getAllPilots() {
        return pilotRepo.getAllPilot();
    }

    public List<Fighter> getAllFighters(){
        return fighterRepo.getAllFighters();
    }

    public List<Pilot> getPilotsWithAccessToTheRoom(){
        return roomRepo.getPilotsWithAccessToTheRoom();
    }

}
