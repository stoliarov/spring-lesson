package ru.hh.lesson.examples.scopes;

import java.util.List;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.hh.lesson.model.Employer;
import ru.hh.lesson.model.Vacancy;
import ru.hh.lesson.model.VacancyList;

@Component
class VacancyService {
  private final EmployerService employerService;
  private final VacancyDao vacancyDao;
  private final ObjectProvider<Locale> locale;

  @Autowired
  VacancyService(EmployerService employerService, VacancyDao vacancyDao, ObjectProvider<Locale> locale) {
    this.employerService = employerService;
    this.vacancyDao = vacancyDao;
    this.locale = locale;
  }

  VacancyList getAllVacanciesByEmployer(int employerId) {
    String lang = locale.getObject().getLang();
    System.out.println(lang);

    List<Vacancy> vacancies = vacancyDao.findByEmployerId(employerId).stream()
        .map(v -> new Vacancy(v.getId(), v.getEmployerId(), v.getTitle(), v.getDescription()))
        .toList();
    Employer employer = employerService.getEmployer(employerId);
    return new VacancyList(employer, vacancies);
  }
}
