package ru.hh.lesson.examples.scopes;

import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ru.hh.lesson.model.Employer;

@Service
@Scope(SCOPE_PROTOTYPE)
class EmployerService {
  private final EmployerDao employerDao;

  @Autowired
  EmployerService(EmployerDao employerDao) {
    this.employerDao = employerDao;
  }

  Employer getEmployer(int id) {
    return employerDao.findById(id)
        .map(e -> new Employer(e.getId(), e.getDescription()))
        .orElse(null);
  }
}
