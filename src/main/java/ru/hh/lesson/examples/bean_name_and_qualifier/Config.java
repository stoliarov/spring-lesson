package ru.hh.lesson.examples.bean_name_and_qualifier;

import jakarta.persistence.EntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class Config {

  @Bean
  EmployerDao employerDao(EntityManager entityManager) {
    return new EmployerDao(entityManager);
  }

  @Bean("employerDao1")
  EmployerDao oneMoreEmployerDao(EntityManager entityManager) {
    return new EmployerDao(entityManager);
  }
}
