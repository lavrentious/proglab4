package ru.lavrent.lab4;

public class Environment {
  public String type;

  public Environment(String type) {
    this.type = type;
  }

  public static class Tree {
    private int height;
    Treetop treetop;

    public Tree(int height, String color) {
      this.height = height;
      this.treetop = new Treetop(color);
    }

    @Override
    public String toString() {
      return "дерево высотой " + this.height + "(" + this.treetop.toString() + ")";
    }

    class Treetop {
      private String color;

      public Treetop(String color) {
        this.color = color;
      }

      public String getColor() {
        return this.color;
      }

      @Override
      public String toString() {
        return "верхушка дерева (цвет - %s)".formatted(this.getColor());
      }

    }
  }

}