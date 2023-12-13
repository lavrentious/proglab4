package ru.lavrent.lab4.exceptions;

import ru.lavrent.lab4.ClothingType;
import ru.lavrent.lab4.Hemul;

public class UglyClothesException extends Exception {
  public UglyClothesException(Hemul hemul, ClothingType clothingType) {
    super("%s не может похвастаться одеждой (%s)".formatted(hemul.toString(), clothingType.toString()));
  }
}
