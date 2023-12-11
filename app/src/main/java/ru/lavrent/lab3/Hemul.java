package ru.lavrent.lab3;

import ru.lavrent.lab3.exceptions.ForbiddenLootException;
import ru.lavrent.lab3.exceptions.NoCloudsException;

import java.util.List;
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

  public void hunt(String loot) throws ForbiddenLootException {
    if (loot.toLowerCase().contains("хемул"))
      throw new ForbiddenLootException(this, "хемуль добывает ЧТО?? это каннибализм!");
    System.out.println("Хемуль " + getName() + " добывает " + loot + ".");
  }

  public String[] getCollection() {
    class Collection { // nested local class
      private String[] items;

      public Collection(String[] items) {
        this.items = items;
      }

      public String[] getItems() {
        return this.items;
      }
    }
    Collection collection = new Collection(new String[] { "stul", "stol", "shkaf" });
    return collection.getItems();
  }

  @Override
  public String toString() {
    return "Хемуль " + getName() + ", одетый в " + clothingType.toString() + "";
  }

  public void releaseClouds(List<EggShell.Cloud> clouds) {
    System.out.println(this.toString() + " идёт выпускать тучки...");
    if (clouds.size() == 0)
      throw new NoCloudsException("...но тучек не оказалось");
    for (EggShell.Cloud cloud : clouds) {
      System.out.println(cloud.toString() + " выпущена");
    }
  }

  @Override
  public int hashCode() {
    int[] primes = { 1087, 1091, 1093, 1097, 1103, 1109, 1117, 1123, 1129, 1151 };
    int ans = 0;
    final int k = this.clothingType.ordinal();
    for (int i = 0; i < name.length(); i++) {
      int charCode = (int) this.name.charAt(i);
      ans += (int) Math.pow(primes[(charCode + k) % primes.length], i + charCode + k) % Integer.MAX_VALUE;
    }
    return ans;
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
