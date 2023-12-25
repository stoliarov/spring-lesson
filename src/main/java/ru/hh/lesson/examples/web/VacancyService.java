package ru.hh.lesson.examples.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.hh.lesson.model.Vacancy;

@Component
class VacancyService {
  private final EmployerService employerService;
  private final VacancyDao vacancyDao;

  @Autowired
  VacancyService(EmployerService employerService, VacancyDao vacancyDao) {
    this.employerService = employerService;
    this.vacancyDao = vacancyDao;
  }

  Vacancy getVacancy(int vacancyId) {
    // Нашли в базе и возвращаем
    return new Vacancy();
  }

  List<Vacancy> getAllVacanciesByEmployer(int employerId) {
    // Нашли все вакансии в базе и возвращаем
    return List.of();
  }

  Vacancy createVacancy(Vacancy vacancy) {
    // Сохраняем в базу и возвращаем
    return vacancy;
  }

  Vacancy updateVacancy(Vacancy vacancy) {
    // Сохраняем в базу и возвращаем
    return vacancy;
  }

  void deleteVacancy(int vacancyId) {
    // Удалили из базы
  }
}
