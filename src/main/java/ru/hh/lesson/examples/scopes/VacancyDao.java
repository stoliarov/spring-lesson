package ru.hh.lesson.examples.scopes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.hh.lesson.model.Vacancy;

@Component
class VacancyDao {
  private final JdbcTemplate jdbcTemplate;

  @Autowired
  VacancyDao(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  List<Vacancy> findByEmployerId(int employerId) {
    // якобы нашли это в БД
    return List.of(new Vacancy(1, employerId, "Java Developer", "Ищем java-разработчика. Требования: ..."));
  }
}
