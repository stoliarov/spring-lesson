package ru.hh.lesson.model;

import java.util.List;

public class VacancyList {
  public Employer employer;
  public List<Vacancy> vacancy;

  public VacancyList() {
  }

  public VacancyList(Employer employer, List<Vacancy> vacancy) {
    this.employer = employer;
    this.vacancy = vacancy;
  }
}
