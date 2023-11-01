package ru.lavrent.lab3;

import javax.annotation.Nonnull;

import java.util.Objects;

public abstract class Character {
  @Nonnull
  protected String name;
  @Nonnull
  private String species;

  public Character(String name, String species) {
    this.name = Objects.requireNonNull(name);
    this.species = Objects.requireNonNull(species);
  }

  public String getName() {
    return name;
  }

  public String getSpecies() {
    return species;
  }

  @Override
  public String toString() {
    return "Персонаж " + getName() + ".";
  }

  @Override
  public int hashCode() {
    return 17 * (super.hashCode() + getName().hashCode());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Character character = (Character) obj;
    return getName().equals(character.getName());
  }
}
