package ru.hh.lesson.examples.evolution.stage_3;

import org.springframework.jdbc.core.JdbcTemplate;
import ru.hh.lesson.model.Employer;

class EmployerDao {
  private final JdbcTemplate jdbcTemplate;

  EmployerDao(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  Employer findById(int id) {
    // якобы нашли это в БД
    return new Employer(id, "Отличная компания, работайте только у нас");
  }
}
