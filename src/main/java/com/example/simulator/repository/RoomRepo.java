package com.example.simulator.repository;

import com.example.simulator.entity.Pilot;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class RoomRepo {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<Pilot> getPilotsWithAccessToTheRoom() {
        return null;
    }


}
