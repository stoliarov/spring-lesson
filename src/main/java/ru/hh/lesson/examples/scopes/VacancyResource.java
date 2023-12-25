package ru.hh.lesson.examples.scopes;

import java.util.List;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.hh.lesson.model.Vacancy;

@RestController
@RequestMapping("/v7/vacancy")
class VacancyResource {
  private final VacancyService vacancyService;
  private final ObjectProvider<EmployerDetails> employerDetails;

  @Autowired
  VacancyResource(VacancyService vacancyService, ObjectProvider<EmployerDetails> employerDetails) {
    this.vacancyService = vacancyService;
    this.employerDetails = employerDetails;
  }

  @GetMapping
  List<Vacancy> getVacancies(@RequestParam Integer employerId, @RequestParam(required = false) String userRegion) {
    employerDetails.getObject().setUserRegion(userRegion);
    return vacancyService.getAllVacanciesByEmployer(employerId);
  }
}
