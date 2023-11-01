package ru.lavrent.lab3;

public enum ClothingType {
  SKIRT("юбка"),
  DRESS("платье"),
  SHIRT("рубашка"),
  PANTS("штаны");

  private String name;

  private ClothingType(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}