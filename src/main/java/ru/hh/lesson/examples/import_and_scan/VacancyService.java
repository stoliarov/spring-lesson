package ru.hh.lesson.examples.import_and_scan;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hh.lesson.model.Vacancy;

@Service
class VacancyService {
  private final EmployerService employerService;
  private final VacancyDao vacancyDao;

  @Autowired
  VacancyService(EmployerService employerService, VacancyDao vacancyDao) {
    this.employerService = employerService;
    this.vacancyDao = vacancyDao;
  }

  List<Vacancy> getAllVacanciesByEmployer(int employerId) {
    // Как-то используем vacancyDao и employerService
    return List.of();
  }
}
