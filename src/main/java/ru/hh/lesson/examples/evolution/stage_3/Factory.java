package ru.hh.lesson.examples.evolution.stage_3;

import org.springframework.jdbc.core.JdbcTemplate;

class Factory {
  private static Factory instance;

  private final JdbcTemplate jdbcTemplate;
  private final EmployerDao employerDao;
  private final VacancyDao vacancyDao;
  private final EmployerService employerService;
  private final VacancyService vacancyService;

  private Factory() {
    this.jdbcTemplate = new JdbcTemplate();
    this.employerDao = new EmployerDao(jdbcTemplate);
    this.vacancyDao = new VacancyDao(jdbcTemplate);
    this.employerService = new EmployerService(employerDao);
    this.vacancyService = new VacancyService(employerService, vacancyDao);
  }

  static synchronized Factory getInstance() {
    if (instance == null) {
      instance = new Factory();
    }
    return instance;
  }

  JdbcTemplate getJdbcTemplate() {
    return jdbcTemplate;
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
