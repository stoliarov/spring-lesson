package ru.hh.lesson.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vacancy")
public class VacancyEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "employer_id", insertable = false, updatable = false)
  private Integer employerId;

  @Column(name = "title")
  private String title;

  @Column(name = "description")
  private String description;

  @JoinColumn(name = "employer_id")
  @ManyToOne(fetch = FetchType.LAZY)
  private EmployerEntity employer;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getEmployerId() {
    return employerId;
  }

  public void setEmployerId(Integer employerId) {
    this.employerId = employerId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EmployerEntity getEmployer() {
    return employer;
  }

  public void setEmployer(EmployerEntity employer) {
    this.employer = employer;
  }
}
