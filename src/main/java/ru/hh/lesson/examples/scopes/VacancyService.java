package ru.hh.lesson.examples.scopes;

import java.util.List;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.hh.lesson.model.Vacancy;

@Component
class VacancyService {
  private final EmployerService employerService;
  private final VacancyDao vacancyDao;
  private final ObjectProvider<EmployerDetails> employerDetails;

  @Autowired
  VacancyService(EmployerService employerService, VacancyDao vacancyDao, ObjectProvider<EmployerDetails> employerDetails) {
    this.employerService = employerService;
    this.vacancyDao = vacancyDao;
    this.employerDetails = employerDetails;
  }

  List<Vacancy> getAllVacanciesByEmployer(int employerId) {
    String userRegion = employerDetails.getObject().getUserRegion();
    System.out.println(userRegion);

    // Как-то используем vacancyDao и employerService
    return List.of();
  }
}
