package ru.hh.lesson.examples.jpa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.hh.lesson.model.Vacancy;

@Component
class VacancyService {
  private final VacancyDao vacancyDao;
  private final VacancyRepository vacancyRepository;

  @Autowired
  VacancyService(VacancyDao vacancyDao, VacancyRepository vacancyRepository) {
    this.vacancyDao = vacancyDao;
    this.vacancyRepository = vacancyRepository;
  }

  List<Vacancy> getAllVacanciesByEmployer(int employerId) {
    return vacancyDao.findByEmployerId(employerId).stream()
        .map(v -> new Vacancy(v.getId(), v.getEmployerId(), v.getTitle(), v.getDescription()))
        .toList();
  }

//  List<Vacancy> getAllVacanciesByEmployer(int employerId) {
//    return vacancyRepository.findAllByEmployerId(employerId).stream()
//        .map(v -> new Vacancy(v.getId(), v.getEmployerId(), v.getTitle(), v.getDescription()))
//        .toList();
//  }
}
