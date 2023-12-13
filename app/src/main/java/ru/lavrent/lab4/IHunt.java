package ru.lavrent.lab4;

import ru.lavrent.lab4.exceptions.ForbiddenLootException;

public interface IHunt {
  void hunt(String loot) throws ForbiddenLootException;
}
