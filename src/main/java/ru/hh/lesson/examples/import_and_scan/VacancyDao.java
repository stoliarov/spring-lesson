package ru.hh.lesson.examples.import_and_scan;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.hh.lesson.model.Vacancy;

class VacancyDao {
  private final JdbcTemplate jdbcTemplate;
//  private final Object someString;

  VacancyDao(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  List<Vacancy> findByEmployerId(int employerId) {
    // якобы нашли это в БД
    return List.of(new Vacancy(1, employerId, "Java Developer", "Ищем java-разработчика. Требования: ..."));
  }
}
