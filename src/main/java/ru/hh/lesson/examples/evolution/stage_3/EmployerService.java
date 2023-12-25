package ru.hh.lesson.examples.evolution.stage_3;

import ru.hh.lesson.model.Employer;

class EmployerService {
  private final EmployerDao employerDao;

  EmployerService(EmployerDao employerDao) {
    this.employerDao = employerDao;
  }

  Employer getEmployer(int id) {
    return employerDao.findById(id);
  }
}
