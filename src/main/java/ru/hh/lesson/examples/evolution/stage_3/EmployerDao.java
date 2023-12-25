package ru.hh.lesson.examples.evolution.stage_3;

import jakarta.persistence.EntityManager;
import java.util.Optional;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.hh.lesson.entity.EmployerEntity;
import ru.hh.lesson.model.Employer;

class EmployerDao {
  private final EntityManager entityManager;

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
