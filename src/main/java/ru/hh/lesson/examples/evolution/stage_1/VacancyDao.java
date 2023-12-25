package ru.hh.lesson.examples.evolution.stage_1;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.hh.lesson.model.Vacancy;

class VacancyDao {
  private final JdbcTemplate jdbcTemplate = new JdbcTemplate();

  List<Vacancy> findByEmployerId(int employerId) {
    // якобы нашли это в БД
    return List.of(new Vacancy(1, employerId, "Java Developer", "Ищем java-разработчика. Требования: ..."));
  }
}
