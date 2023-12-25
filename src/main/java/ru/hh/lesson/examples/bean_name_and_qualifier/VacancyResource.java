package ru.hh.lesson.examples.bean_name_and_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.hh.lesson.model.VacancyList;

@RestController
@RequestMapping("/v1/vacancy")
class VacancyResource {
  private final VacancyService vacancyService;

  @Autowired
  VacancyResource(VacancyService vacancyService) {
    this.vacancyService = vacancyService;
  }

  @GetMapping
  VacancyList getVacancies(@RequestParam Integer employerId) {
    return vacancyService.getAllVacanciesByEmployer(employerId);
  }
}
