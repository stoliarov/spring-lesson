package ru.hh.lesson.examples.evolution.stage_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.hh.lesson.model.Employer;

@Repository
class EmployerDao {
  private final JdbcTemplate jdbcTemplate;

  @Autowired
  EmployerDao(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  Employer findById(int id) {
    // якобы нашли это в БД
    return new Employer(id, "Отличная компания, работайте только у нас");
  }
}
