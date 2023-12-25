package ru.hh.lesson.examples.collection_injection;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements PricesUpdatedEventListener {

  @Override
  public void handleEvent() {
    // Отправить клиенту письмо с новыми ценами, т.к. эти цены изменились.
  }
}
