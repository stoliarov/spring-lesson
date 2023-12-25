package ru.hh.lesson.examples.qualifier_and_primary;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
class Config {

  @Bean("employerDao1")
  EmployerDao employerDao1(JdbcTemplate jdbcTemplate) {
    return new EmployerDao(jdbcTemplate, 1);
  }

  @Bean("employerDao2")
  EmployerDao employerDao2(JdbcTemplate jdbcTemplate) {
    return new EmployerDao(jdbcTemplate, 2);
  }

//  @Bean("employerDao3")
//  @Primary
//  EmployerDao employerDao3(JdbcTemplate jdbcTemplate) {
//    return new EmployerDao(jdbcTemplate, 3);
//  }

//  @Bean("employerDao4")
//  @Qualifier("salam")
//  EmployerDao employerDao4(JdbcTemplate jdbcTemplate) {
//    return new EmployerDao(jdbcTemplate, 4);
//  }
}
