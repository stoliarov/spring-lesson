package ru.hh.lesson.examples.qualifier_and_primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.hh.lesson.model.Employer;

@Service
class EmployerService {
  private final EmployerDao employerDao;

  @Autowired
  EmployerService(@Qualifier("salam") EmployerDao employerDao) {
    this.employerDao = employerDao;
  }

  Employer getEmployer(int id) {
    return employerDao.findById(id);
  }
}
