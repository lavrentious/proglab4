package ru.lavrent.lab3;

import ru.lavrent.lab3.exceptions.ForbiddenLootException;

public interface IHunt {
  void hunt(String loot) throws ForbiddenLootException;
}
