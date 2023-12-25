package ru.hh.lesson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"ru.hh.lesson.examples.import_and_scan"})
public class SpringLessonApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringLessonApplication.class, args);
  }

}
