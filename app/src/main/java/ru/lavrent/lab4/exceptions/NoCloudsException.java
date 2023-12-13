package ru.lavrent.lab4.exceptions;

public class NoCloudsException extends RuntimeException { // unchecked exception
  public NoCloudsException(String message) {
    super(message);
  }
}
