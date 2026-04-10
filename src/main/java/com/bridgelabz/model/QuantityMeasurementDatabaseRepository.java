package com.bridgelabz.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.bridgelabz.entity.QuantityMeasurementEntity;

import java.util.List;

@Repository
public class QuantityMeasurementDatabaseRepository implements IQuantityMeasurementRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(QuantityMeasurementEntity entity) {

        String sql = "INSERT INTO quantity_measurement_entity " +
                "(first_value, first_unit, second_value, second_unit, operation, result_value, result_unit) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(sql,
                entity.getFirstValue(),
                entity.getFirstUnit(),
                entity.getSecondValue(),
                entity.getSecondUnit(),
                entity.getOperation(),
                entity.getResultValue(),
                entity.getResultUnit());
    }

    @Override
    public List<QuantityMeasurementEntity> findAll() {

        String sql = "SELECT * FROM quantity_measurement_entity";

        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            QuantityMeasurementEntity entity = new QuantityMeasurementEntity();
            entity.setId(rs.getLong("id"));
            entity.setFirstValue(rs.getDouble("first_value"));
            entity.setFirstUnit(rs.getString("first_unit"));
            entity.setSecondValue(rs.getDouble("second_value"));
            entity.setSecondUnit(rs.getString("second_unit"));
            entity.setOperation(rs.getString("operation"));
            entity.setResultValue(rs.getDouble("result_value"));
            entity.setResultUnit(rs.getString("result_unit"));
            return entity;
        });
    }
}