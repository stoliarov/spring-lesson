package ru.hh.lesson.examples.evolution.stage_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hh.lesson.model.Employer;

@Service
class EmployerService {
  private EmployerDao employerDao;

  @Autowired
  void setEmployerDao(EmployerDao employerDao) {
    this.employerDao = employerDao;
  }

  Employer getEmployer(int id) {
    return employerDao.findById(id)
        .map(e -> new Employer(e.getId(), e.getDescription()))
        .orElse(null);
  }
}
