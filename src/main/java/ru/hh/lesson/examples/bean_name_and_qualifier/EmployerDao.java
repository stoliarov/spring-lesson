package ru.hh.lesson.examples.bean_name_and_qualifier;

import jakarta.persistence.EntityManager;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import ru.hh.lesson.entity.EmployerEntity;

class EmployerDao {
  private final EntityManager entityManager;

  @Autowired
  EmployerDao(EntityManager entityManager) {
    this.entityManager = entityManager;
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
