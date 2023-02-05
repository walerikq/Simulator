package com.example.simulator.repository;

import com.example.simulator.entity.Fighter;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FighterRepo {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<Fighter> getAllFighters() {
        return null;
    }

}
