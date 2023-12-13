package ru.lavrent.lab4;

public class EggShell {
  private static int count = 5;

  public static class Cloud { // static nested class
    private int number;

    public Cloud(int number) {
      this.number = number;
    }

    @Override
    public String toString() {
      return "тучка № " + this.number;
    }

    public String getRelation() {
      return this.toString() + " имеет отношение к " + EggShell.count + " яичным скорлупкам.";
    }
  }
}
