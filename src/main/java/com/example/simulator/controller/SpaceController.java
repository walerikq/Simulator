package com.example.simulator.controller;


import com.example.simulator.entity.Pilot;
import com.example.simulator.service.SpaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/headquarters")
public class SpaceController {

    private SpaceService spaceService;

    @GetMapping("/all-pilots-list")
    public List<Pilot> getAllPilots(){
        return spaceService.getAllPilots();
    }

}
