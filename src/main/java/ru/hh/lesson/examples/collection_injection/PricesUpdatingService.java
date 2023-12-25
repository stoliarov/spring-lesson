package ru.hh.lesson.examples.collection_injection;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PricesUpdatingService {

  private final List<PricesUpdatedEventListener> pricesUpdatedEventListeners;

  @Autowired
  public PricesUpdatingService(List<PricesUpdatedEventListener> pricesUpdatedEventListeners) {
    this.pricesUpdatedEventListeners = pricesUpdatedEventListeners;
  }

  public void updatePrices() {
    // ...
    // Обновили цены и заодно уведомляем всех заинтересованных.
    pricesUpdatedEventListeners.forEach(PricesUpdatedEventListener::handleEvent);
  }
}
