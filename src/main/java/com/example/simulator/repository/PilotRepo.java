package com.example.simulator.repository;

import com.example.simulator.entity.Pilot;
import com.example.simulator.util.ScriptReader;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@RequiredArgsConstructor
@Repository
public class PilotRepo {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<Pilot> getAllPilot(){
        String request = ScriptReader.read("sql/getAllPilots.sql");
        return namedParameterJdbcTemplate.query(request,
                (rs, rowNum) -> buildPatitenFromRs(rs));

    }

    private Pilot buildPatitenFromRs(ResultSet rs) throws SQLException {
        return Pilot.builder()
                .id(UUID.fromString(rs.getString("id")))
                .name(rs.getString("name"))
                .surname(rs.getString("surname"))
                .age(rs.getInt("age"))
                .build();
    }
}
