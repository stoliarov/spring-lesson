package ru.hh.lesson.examples.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hh.lesson.model.Employer;

@Service
class EmployerService {
  private final EmployerDao employerDao;

  @Autowired
  EmployerService(EmployerDao employerDao) {
    this.employerDao = employerDao;
  }

  Employer getEmployer(int id) {
    return employerDao.findById(id);
  }
}
