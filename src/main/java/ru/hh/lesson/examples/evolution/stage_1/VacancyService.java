package ru.hh.lesson.examples.evolution.stage_1;

import java.util.List;
import ru.hh.lesson.model.Employer;
import ru.hh.lesson.model.Vacancy;
import ru.hh.lesson.model.VacancyList;

class VacancyService {
  private final EmployerService employerService = new EmployerService();
  private final VacancyDao vacancyDao = new VacancyDao();

  VacancyList getAllVacanciesByEmployer(int employerId) {
    List<Vacancy> vacancies = vacancyDao.findByEmployerId(employerId).stream()
        .map(v -> new Vacancy(v.getId(), v.getEmployerId(), v.getTitle(), v.getDescription()))
        .toList();
    Employer employer = employerService.getEmployer(employerId);
    return new VacancyList(employer, vacancies);
  }
}
