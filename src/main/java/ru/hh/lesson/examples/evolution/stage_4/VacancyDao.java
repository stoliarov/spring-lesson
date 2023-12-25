package ru.hh.lesson.examples.evolution.stage_4;

import jakarta.persistence.EntityManager;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.hh.lesson.entity.VacancyEntity;

@Component
class VacancyDao {
  @Autowired
  private EntityManager entityManager;

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
