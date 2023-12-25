package ru.hh.lesson.examples.evolution.stage_3;

import jakarta.persistence.EntityManager;

class Factory {
  private static Factory instance;

  private final EntityManager entityManager;
  private final EmployerDao employerDao;
  private final VacancyDao vacancyDao;
  private final EmployerService employerService;
  private final VacancyService vacancyService;

  private Factory() {
    this.entityManager = initEntityManager();
    this.employerDao = new EmployerDao(entityManager);
    this.vacancyDao = new VacancyDao(entityManager);
    this.employerService = new EmployerService(employerDao);
    this.vacancyService = new VacancyService(employerService, vacancyDao);
  }

  private static EntityManager initEntityManager() {
    // Как-то создаем и настраиваем EntityManager
    return null;
  }

  static synchronized Factory getInstance() {
    if (instance == null) {
      instance = new Factory();
    }
    return instance;
  }

  EntityManager getEntityManager() {
    return entityManager;
  }

  EmployerDao getEmployerDao() {
    return employerDao;
  }

  VacancyDao getVacancyDao() {
    return vacancyDao;
  }

  EmployerService getEmployerService() {
    return employerService;
  }

  VacancyService getVacancyService() {
    return vacancyService;
  }
}
