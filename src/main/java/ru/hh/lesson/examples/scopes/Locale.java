package ru.hh.lesson.examples.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import static org.springframework.web.context.WebApplicationContext.SCOPE_REQUEST;

@Scope(SCOPE_REQUEST)
@Component
class Locale {
  private String lang;

  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }
}
