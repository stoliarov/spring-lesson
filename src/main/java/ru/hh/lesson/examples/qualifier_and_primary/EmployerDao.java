package ru.hh.lesson.examples.qualifier_and_primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.hh.lesson.model.Employer;

class EmployerDao {
  private final JdbcTemplate jdbcTemplate;
  private final int code;

  @Autowired
  EmployerDao(JdbcTemplate jdbcTemplate, int code) {
    this.jdbcTemplate = jdbcTemplate;
    this.code = code;
  }

  Employer findById(int id) {
    // якобы нашли это в БД
    return new Employer(id, "Отличная компания, работайте только у нас");
  }
}
