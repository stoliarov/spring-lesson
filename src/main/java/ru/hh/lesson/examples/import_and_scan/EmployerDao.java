package ru.hh.lesson.examples.import_and_scan;

import jakarta.persistence.EntityManager;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.hh.lesson.entity.EmployerEntity;

@Component
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
