package ru.hh.lesson.examples.jpa;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.hh.lesson.entity.VacancyEntity;

@Repository
public interface VacancyRepository extends CrudRepository<VacancyEntity, Integer> {

  @Query("SELECT vacancy FROM VacancyEntity vacancy " +
      "WHERE vacancy.employerId = :employerId")
  List<VacancyEntity> findAllByEmployerId(Integer employerId);
}
