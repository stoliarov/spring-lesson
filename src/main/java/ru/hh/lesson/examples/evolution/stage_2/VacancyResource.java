package ru.hh.lesson.examples.evolution.stage_2;

import jakarta.persistence.EntityManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.hh.lesson.model.VacancyList;

@RestController
@RequestMapping("/v1/vacancy")
class VacancyResource {
  private final VacancyService vacancyService;

  VacancyResource() {
    EntityManager entityManager = initEntityManager();
    vacancyService = new VacancyService(
        new EmployerService(new EmployerDao(entityManager)),
        new VacancyDao(entityManager)
    );
  }

  private static EntityManager initEntityManager() {
    // Как-то создаем и настраиваем EntityManager
    return null;
  }

  @GetMapping
  VacancyList getVacancies(@RequestParam Integer employerId) {
    return vacancyService.getAllVacanciesByEmployer(employerId);
  }
}
