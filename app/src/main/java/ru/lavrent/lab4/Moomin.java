package ru.lavrent.lab4;

public class Moomin extends Character implements IFly {
  public Moomin(String name) {
    super(name, "moomin");
  }

  public void flyOver(Object o) {
    System.out.println(this.toString() + " flies over " + o.toString());
  }

  @Override
  public String toString() {
    return "moomin named " + this.name;
  }
}
