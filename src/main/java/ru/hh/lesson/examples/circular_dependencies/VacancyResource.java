package ru.hh.lesson.examples.circular_dependencies;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.hh.lesson.model.Vacancy;

@RestController
@RequestMapping("/v4/vacancy")
class VacancyResource {
  private final VacancyService vacancyService;

  @Autowired
  VacancyResource(VacancyService vacancyService) {
    this.vacancyService = vacancyService;
  }

  @GetMapping
  List<Vacancy> getVacancies(@RequestParam Integer employerId) {
    return vacancyService.getAllVacanciesByEmployer(employerId);
  }
}
