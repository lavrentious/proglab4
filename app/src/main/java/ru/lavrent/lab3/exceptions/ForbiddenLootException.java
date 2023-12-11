package ru.lavrent.lab3.exceptions;

import ru.lavrent.lab3.Hemul;

public class ForbiddenLootException extends Exception { // checked exception
  public ForbiddenLootException(Hemul hemul, String message) {
    super(hemul.toString() + ": " + message);
  }
}
