package ru.hh.lesson.examples.evolution.stage_3;

import java.util.List;
import ru.hh.lesson.model.Vacancy;

class VacancyService {
  private final EmployerService employerService;
  private final VacancyDao vacancyDao;

  VacancyService(EmployerService employerService, VacancyDao vacancyDao) {
    this.employerService = employerService;
    this.vacancyDao = vacancyDao;
  }

  List<Vacancy> getAllVacanciesByEmployer(int employerId) {
    // Как-то используем vacancyDao и employerService
    return List.of();
  }
}
