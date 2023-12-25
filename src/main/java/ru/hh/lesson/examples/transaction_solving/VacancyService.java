package ru.hh.lesson.examples.transaction_solving;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import ru.hh.lesson.model.Vacancy;

@Component
class VacancyService {
  private final VacancyDao vacancyDao;

  @Autowired
  VacancyService(VacancyDao vacancyDao) {
    this.vacancyDao = vacancyDao;
  }

  List<Vacancy> getAllVacanciesByEmployerWithProblem(int employerId) {
    return getAllVacanciesByEmployer(employerId);
  }

  @Transactional
  List<Vacancy> getAllVacanciesByEmployer(int employerId) {

    System.out.println(TransactionSynchronizationManager.isActualTransactionActive());

    return vacancyDao.findByEmployerId(employerId).stream()
        .map(v -> new Vacancy(v.getId(), v.getEmployerId(), v.getTitle(), v.getDescription()))
        .toList();
  }
}
