package ru.lavrent.lab4;

import ru.lavrent.lab4.exceptions.HemulCollectionTooBig;
import ru.lavrent.lab4.exceptions.UglyClothesException;

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

  public void showoffClothes() throws UglyClothesException {
    if (this.clothingType == ClothingType.PANTS)
      throw new UglyClothesException(this, this.clothingType);
    System.out.println("%s хвастается одеждой".formatted(this.toString()));
  }

  public void hunt(String loot) {
    System.out.println("Хемуль " + getName() + " добывает " + loot + ".");
  }

  public void analyseCollection(List<String> items) {
    class HemulsCollection {
      private final String[] content;

      public HemulsCollection(List<String> items, int maxSize) {
        if (items.size() > maxSize)
          throw new HemulCollectionTooBig(Hemul.this, items.size(), maxSize);
        this.content = new String[items.size()];
        items.toArray(this.content);
      }

      public String toString() {
        return String.format("коллекция с содержимым: %s",
            String.join(", ", this.content));
      }
    }
    HemulsCollection hemulsCollection = new HemulsCollection(items, 25);
    System.out.println("%s анализирует свою коллекцию (%s)".formatted(this.toString(), hemulsCollection.toString()));
  }

  @Override
  public String toString() {
    return "Хемуль " + getName() + ", одетый в " + clothingType.toString();
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
