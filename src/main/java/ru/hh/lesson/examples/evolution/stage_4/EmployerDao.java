package ru.hh.lesson.examples.evolution.stage_4;

import jakarta.persistence.EntityManager;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.hh.lesson.entity.EmployerEntity;

@Repository
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
