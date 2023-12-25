package ru.hh.lesson.examples.evolution.stage_2;

import ru.hh.lesson.model.Employer;

class EmployerService {
  private final EmployerDao employerDao;

  EmployerService(EmployerDao employerDao) {
    this.employerDao = employerDao;
  }

  Employer getEmployer(int id) {
    return employerDao.findById(id)
        .map(e -> new Employer(e.getId(), e.getDescription()))
        .orElse(null);
  }
}
