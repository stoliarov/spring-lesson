package ru.hh.lesson.examples.scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.hh.lesson.model.Employer;

@RestController
@RequestMapping("/v1/employer")
class EmployerResource {
  private final EmployerService employerService;

  @Autowired
  EmployerResource(EmployerService employerService) {
    this.employerService = employerService;
  }

  @GetMapping
  Employer getEmployer(@RequestParam Integer employerId) {
    return employerService.getEmployer(employerId);
  }
}
