package ru.lavrent.lab3;

public class Moomin extends Character {
  public Moomin(String name) {
    super(name, "Moomin");
  }

  class Flyer { // non-static nested class
    public void fly() {
      System.out.println("Moomin " + Moomin.this.name + " is flying!");
    }
  }
}
