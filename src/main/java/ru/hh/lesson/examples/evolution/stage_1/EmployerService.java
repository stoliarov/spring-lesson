package ru.hh.lesson.examples.evolution.stage_1;

import ru.hh.lesson.model.Employer;

class EmployerService {
  private final EmployerDao employerDao = new EmployerDao();

  Employer getEmployer(int id) {
    return employerDao.findById(id)
        .map(e -> new Employer(e.getId(), e.getDescription()))
        .orElse(null);
  }
}
