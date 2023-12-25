package ru.hh.lesson.examples.qualifier_and_primary;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.hh.lesson.model.Vacancy;

@Component
class VacancyService {
  private final EmployerService employerService;
  private final VacancyDao vacancyDao;

  @Autowired
  VacancyService(EmployerService employerService, VacancyDao vacancyDao2) {
    this.employerService = employerService;
    this.vacancyDao = vacancyDao2;
  }

  List<Vacancy> getAllVacanciesByEmployer(int employerId) {
    // Как-то используем vacancyDao и employerService
    return List.of();
  }
}
