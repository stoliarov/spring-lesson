package ru.hh.lesson.model;

public class Vacancy {
  public Integer id;
  public Integer employerId;
  public String title;
  public String description;

  public Vacancy() {
  }

  public Vacancy(Integer id, Integer employerId, String title, String description) {
    this.id = id;
    this.employerId = employerId;
    this.title = title;
    this.description = description;
  }
}
