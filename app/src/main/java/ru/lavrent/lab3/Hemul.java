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
