package ru.hh.lesson.examples.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import static org.springframework.web.context.WebApplicationContext.SCOPE_REQUEST;

@Scope(value = SCOPE_REQUEST)
@Component
class EmployerDetails {
  private String userRegion;

  public String getUserRegion() {
    return userRegion;
  }

  public void setUserRegion(String userRegion) {
    this.userRegion = userRegion;
  }
}
