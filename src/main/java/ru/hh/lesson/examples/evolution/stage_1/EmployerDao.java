package ru.hh.lesson.examples.evolution.stage_1;

import jakarta.persistence.EntityManager;
import java.util.Optional;
import ru.hh.lesson.entity.EmployerEntity;

class EmployerDao {
  private final EntityManager entityManager = initEntityManager();

  private static EntityManager initEntityManager() {
    // Как-то создаем и настраиваем EntityManager
    return null;
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
