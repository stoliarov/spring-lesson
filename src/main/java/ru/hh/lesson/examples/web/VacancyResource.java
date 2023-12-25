package ru.hh.lesson.examples.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.hh.lesson.model.Vacancy;

@RestController
@RequestMapping("/v1/vacancy")
class VacancyResource {
  private final VacancyService vacancyService;

  @Autowired
  public VacancyResource(VacancyService vacancyService) {
    this.vacancyService = vacancyService;
  }

  // GET /v1/vacancy/123
  @GetMapping("/{id}")
  public Vacancy getVacancy(@PathVariable("id") Integer vacancyId) {
    return vacancyService.getVacancy(vacancyId);
  }

  // GET /v1/vacancy?employerId=123
  @GetMapping
  public List<Vacancy> getVacancies(@RequestParam Integer employerId) {
    return vacancyService.getAllVacanciesByEmployer(employerId);
  }

  // POST /v1/vacancy + тело запроса { "employerId": 123, "title": "Вакансия", ... }
  @PostMapping
  public Vacancy createVacancy(@RequestBody Vacancy vacancy) {
    return vacancyService.createVacancy(vacancy);
  }

  // DELETE /v1/vacancy/123
  @DeleteMapping("/{id}")
  public void deleteVacancy(@PathVariable("id") Integer vacancyId) {
    vacancyService.deleteVacancy(vacancyId);
  }
}

