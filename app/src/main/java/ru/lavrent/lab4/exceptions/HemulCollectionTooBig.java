package ru.lavrent.lab4.exceptions;

import ru.lavrent.lab4.Hemul;

public class HemulCollectionTooBig extends RuntimeException {
  public HemulCollectionTooBig(Hemul hemul, int count, int maxCount) {
    super("коллекция хемуля %s слишком велика: %d, максимум %d".formatted(hemul.toString(), count, maxCount));
  }
}
