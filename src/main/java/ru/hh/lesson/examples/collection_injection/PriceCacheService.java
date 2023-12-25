package ru.hh.lesson.examples.collection_injection;

import org.springframework.stereotype.Component;

@Component
public class PriceCacheService implements PricesUpdatedEventListener {

  @Override
  public void handleEvent() {
    // Очистить кэш с ценами, т.к. эти цены изменились.
  }
}
