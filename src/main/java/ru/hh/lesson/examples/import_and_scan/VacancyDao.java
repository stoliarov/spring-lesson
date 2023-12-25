package ru.hh.lesson.examples.import_and_scan;

import jakarta.persistence.EntityManager;
import java.util.List;
import ru.hh.lesson.entity.VacancyEntity;

class VacancyDao {
  private final EntityManager entityManager;
  private final String someString;

  VacancyDao(EntityManager entityManager, String someString) {
    this.entityManager = entityManager;
    this.someString = someString;
  }

  List<VacancyEntity> findByEmployerId(int employerId) {
    System.out.println(someString);

    return entityManager.createQuery(
            "SELECT vacancy FROM VacancyEntity vacancy " +
                "WHERE vacancy.employerId = :employerId",
            VacancyEntity.class
        )
        .setParameter("employerId", employerId)
        .getResultList();
  }
}
