package ru.hh.lesson.examples.transaction_solving;

import java.util.function.Supplier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TransactionHelper {

  @Transactional
  <T> T executeInTransaction(Supplier<T> supplier) {
    return supplier.get();
  }
}
