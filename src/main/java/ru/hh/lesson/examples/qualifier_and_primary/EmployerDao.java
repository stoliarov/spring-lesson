package ru.hh.lesson.examples.qualifier_and_primary;

import jakarta.persistence.EntityManager;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import ru.hh.lesson.entity.EmployerEntity;

class EmployerDao {
  private final EntityManager entityManager;
  private final int code;

  @Autowired
  EmployerDao(EntityManager entityManager, int code) {
    this.entityManager = entityManager;
    this.code = code;
  }

  Optional<EmployerEntity> findById(int id) {
    return entityManager.createQuery(
            "SELECT employer FROM EmployerEntity employer " +
                "WHERE employer.id = :employerId",
            EmployerEntity.class
        )
        .setParameter("employerId", id)
        .getResultList()
        .stream()
        .findFirst();
  }
}
