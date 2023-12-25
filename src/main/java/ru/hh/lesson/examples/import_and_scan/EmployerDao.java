package ru.hh.lesson.examples.import_and_scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.hh.lesson.model.Employer;

@Component
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
