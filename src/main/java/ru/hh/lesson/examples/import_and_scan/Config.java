package ru.hh.lesson.examples.import_and_scan;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.EntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

  @Bean
  public EmployerService employerService(EmployerDao employerDao) {
    return new EmployerService(employerDao);
  }

  @Bean
  public VacancyDao vacancyDao(EntityManager entityManager) {
    return new VacancyDao(entityManager, "123");
  }

  @Bean
  public ObjectMapper customObjectMapper() {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    return objectMapper;
  }
}
