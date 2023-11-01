package ru.lavrent.lab3;

import java.util.Objects;

public class Hemul extends Character implements IJoy, IHunt {
  private ClothingType clothingType;

  public Hemul(String name, ClothingType clothingType) {
    super(Objects.requireNonNull(name), "Hemul");
    this.clothingType = Objects.requireNonNull(clothingType);
  }

  public void expressJoy() {
    System.out.println("Хемуль " + getName() + " сиял от радости.");
  }

  public void hunt(String loot) {
    System.out.println("Хемуль " + getName() + " добывает " + loot + ".");
  }

  @Override
  public String toString() {
    return "Хемуль " + getName() + " одет в " + clothingType.toString() + ".";
  }

  @Override
  public int hashCode() {
    return 31 * (super.hashCode() + getName().hashCode() + clothingType.ordinal());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Hemul hemul = (Hemul) obj;
    return getName().equals(hemul.getName()) &&
        clothingType == hemul.clothingType;
  }
}
