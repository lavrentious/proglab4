package ru.lavrent.lab4;

import ru.lavrent.lab4.exceptions.ForbiddenLootException;
import ru.lavrent.lab4.exceptions.NoCloudsException;

import java.util.ArrayList;
import java.util.List;

/*
А Муми-тролль и фрекен Снорк поднялись над верхушками деревьев и, плавно покачиваясь, поплыли в солнечном блеске. При этом они не переставая думали о том, что бы предложить Хемулю для коллекционирования.
Когда они вернулись домой обедать. Хемуль поджидал их на крыльце. Он весь так и сиял от радости.
И он развернул полы юбки [Хемуль всегда ходил в платье, унаследованном от тетки. Подозреваю, что все хемули ходят в юбках. Странно, но факт. (Здесь и далее примеч. автора.)] и показал свою первую добычу. Это был тоненький стебелек гусиного лука, облепленный комьями земли и листьями.
Когда наутро Муми-тролль пошел выпустить тучки из дровяного сарая, их там не оказалось. И никому в голову не пришло, что они имеют какое-либо отношение к пяти яичным скорлупкам, которые как ни в чем не бывало снова лежали в шляпе Волшебника.
*/

public class Main {
    public static void main(String[] args) {
        Hemul unluckyHemul = new Hemul("Walter White", ClothingType.DRESS) { // anonymous class (class)
            @Override
            public void hunt(String loot) {
                System.out.println("Хемуль " + getName() + " не смог ничего добыть(");
            }
        };
        try {
            unluckyHemul.hunt("big bob");
        } catch (ForbiddenLootException e) {
            System.err.println("у хемуля беда: " + e.getMessage());
        }

        Hemul jesse = new Hemul("Jesse Pinkman", ClothingType.SHIRT);
        try { // checked exception
            jesse.hunt("ЖИВОЙ НАСТОЯЩИЙ ХЕМУЛЬ");
        } catch (ForbiddenLootException e) {
            System.err.println("у хемуля беда: " + e.getMessage());
        }

        IJoy snork = new IJoy() { // anonymous class (interface)
            public void expressJoy() {
                System.out.println("Фрекен Снорк радостно плывет в солнечном блеске");
            }
        };
        snork.expressJoy();

        Moomin moomin = new Moomin("Randomniy Mumiy Troll");
        Moomin.Flyer flyer = moomin.new Flyer();
        flyer.fly();

        for (String i : unluckyHemul.getCollection())
            System.out.println(i);

        List<EggShell.Cloud> clouds = new ArrayList<>();
        try {
            jesse.releaseClouds(clouds); // unchecked exception
        } catch (NoCloudsException e) {
            System.err.println("у Джесси проблемы: " + e.getMessage());
        }
        for (int i = 0; i < 3; i++) {
            clouds.add(new EggShell.Cloud(i + 1));
        }
        System.out.println(clouds.size());
        jesse.releaseClouds(clouds);
        for (EggShell.Cloud cloud : clouds) {
            System.out.println(cloud.getRelation());
        }
    }
}
