package ru.hh.lesson.examples.scopes;

import org.springframework.beans.factory.ObjectProvider;
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
  private final ObjectProvider<Locale> locale;

  @Autowired
  VacancyResource(VacancyService vacancyService, ObjectProvider<Locale> locale) {
    this.vacancyService = vacancyService;
    this.locale = locale;
  }

  @GetMapping
  VacancyList getVacancies(@RequestParam Integer employerId, @RequestParam(required = false) String lang) {
    locale.getObject().setLang(lang);
    return vacancyService.getAllVacanciesByEmployer(employerId);
  }
}
