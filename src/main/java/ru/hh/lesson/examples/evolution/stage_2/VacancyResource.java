package ru.hh.lesson.examples.evolution.stage_2;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.hh.lesson.model.Vacancy;

@RestController
@RequestMapping("/v1/vacancy")
class VacancyResource {
  private final VacancyService vacancyService;

  VacancyResource() {
    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    vacancyService = new VacancyService(
        new EmployerService(new EmployerDao(jdbcTemplate)),
        new VacancyDao(jdbcTemplate)
    );
  }

  @GetMapping
  List<Vacancy> getVacancies(@RequestParam Integer employerId) {
    return vacancyService.getAllVacanciesByEmployer(employerId);
  }
}
