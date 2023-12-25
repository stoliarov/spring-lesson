package ru.hh.lesson.examples.transaction_solving;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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

  @GetMapping("/{id}")
  Employer getEmployer(@PathVariable("id") Integer employerId) {
    return employerService.getEmployer(employerId);
  }
}
