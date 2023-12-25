package ru.hh.lesson.examples.import_and_scan;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.hh.lesson.model.Vacancy;

@Configuration
public class Config {

  @Bean
  public VacancyDao vacancyDao(JdbcTemplate jdbcTemplate) {
//    return new VacancyDao(jdbcTemplate, "123");
    return new VacancyDao(jdbcTemplate);
  }

  @Bean
  public ObjectMapper customObjectMapper() {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    return objectMapper;
  }

  @Bean
  public EmployerService employerService(EmployerDao employerDao) {
    return new EmployerService(employerDao);
  }

  @Bean
  public Vacancy vacancy() {
    return true ? null : new Vacancy();
  }
}
