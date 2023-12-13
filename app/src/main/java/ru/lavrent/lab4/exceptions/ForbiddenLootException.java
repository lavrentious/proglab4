package ru.lavrent.lab4.exceptions;

import ru.lavrent.lab4.Hemul;

public class ForbiddenLootException extends Exception { // checked exception
  public ForbiddenLootException(Hemul hemul, String message) {
    super(hemul.toString() + ": " + message);
  }
}
