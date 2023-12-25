package ru.hh.lesson.examples.import_and_scan;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
    EmployerDao.class,
    EmployerService.class,
    Config.class
})
public class ConfigWithImport {

//  @Bean
//  public ObjectMapper secondCustomObjectMapper() {
//    ObjectMapper objectMapper = new ObjectMapper();
//    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//    return objectMapper;
//  }
}
