package ru.hh.lesson.examples.evolution.stage_1;

import jakarta.persistence.EntityManager;
import java.util.List;
import ru.hh.lesson.entity.VacancyEntity;

class VacancyDao {
  private final EntityManager entityManager = initEntityManager();

  private static EntityManager initEntityManager() {
    // Как-то создаем и настраиваем EntityManager
    return null;
  }

  List<VacancyEntity> findByEmployerId(int employerId) {
    return entityManager.createQuery(
            "SELECT vacancy FROM VacancyEntity vacancy " +
                "WHERE vacancy.employerId = :employerId",
            VacancyEntity.class
        )
        .setParameter("employerId", employerId)
        .getResultList();
  }
}
