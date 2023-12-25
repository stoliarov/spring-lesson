package ru.hh.lesson.examples.circular_dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hh.lesson.model.Employer;

@Service
class EmployerService {
  private final EmployerDao employerDao;
  private final VacancyService vacancyService;

  @Autowired
  EmployerService(EmployerDao employerDao, VacancyService vacancyService) {
    this.employerDao = employerDao;
    this.vacancyService = vacancyService;
  }

  Employer getEmployer(int id) {
    return employerDao.findById(id);
  }
}
