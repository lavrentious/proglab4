package ru.lavrent.lab3;

import javax.annotation.Nonnull;

import java.util.Objects;

public abstract class Character {
  @Nonnull
  protected String name;
  @Nonnull
  private String species;

  public Character(@Nonnull String name, String species) {
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
    int result = 17;
    result = 31 * result + name.hashCode();
    result = 31 * result + species.hashCode();
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Character character = (Character) obj;
    return character.hashCode() == obj.hashCode();
  }
}
