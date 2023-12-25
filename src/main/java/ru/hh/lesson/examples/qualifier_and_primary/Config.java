package ru.hh.lesson.examples.qualifier_and_primary;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
class Config {

  @Bean("employerDao1")
  EmployerDao employerDao1(EntityManager entityManager) {
    return new EmployerDao(entityManager, 1);
  }

  @Bean("employerDao2")
  EmployerDao employerDao2(EntityManager entityManager) {
    return new EmployerDao(entityManager, 2);
  }

  @Bean("employerDao3")
  @Primary
  EmployerDao employerDao3(EntityManager entityManager) {
    return new EmployerDao(entityManager, 3);
  }

  @Bean("employerDao4")
  @Qualifier("salam")
  EmployerDao employerDao4(EntityManager entityManager) {
    return new EmployerDao(entityManager, 4);
  }
}
