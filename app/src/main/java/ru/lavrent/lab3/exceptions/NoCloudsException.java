package ru.lavrent.lab3.exceptions;

public class NoCloudsException extends RuntimeException { // unchecked exception
  public NoCloudsException(String message) {
    super(message);
  }
}
