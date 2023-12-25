package ru.hh.lesson.examples.evolution.stage_1;

import java.util.List;
import ru.hh.lesson.model.Vacancy;

class VacancyService {
  private final EmployerService employerService = new EmployerService();
  private final VacancyDao vacancyDao = new VacancyDao();

  List<Vacancy> getAllVacanciesByEmployer(int employerId) {
    // Как-то используем vacancyDao и employerService
    return List.of();
  }
}
