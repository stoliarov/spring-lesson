package ru.hh.lesson.examples.evolution.stage_3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.hh.lesson.model.VacancyList;

@RestController
@RequestMapping("/v1/vacancy")
class VacancyResource {
  private final VacancyService vacancyService = Factory.getInstance().getVacancyService();

  @GetMapping
  VacancyList getVacancies(@RequestParam Integer employerId) {
    return vacancyService.getAllVacanciesByEmployer(employerId);
  }
}
