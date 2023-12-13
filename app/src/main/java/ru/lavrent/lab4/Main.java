package ru.lavrent.lab4;

import ru.lavrent.lab4.exceptions.UglyClothesException;

import java.util.Arrays;

// Когда они вернулись домой обедать. Хемуль поджидал их на крыльце. Он весь так и сиял от радости. И он развернул полы юбки [Хемуль всегда ходил в платье, унаследованном от тетки. Подозреваю, что все хемули ходят в юбках. Странно, но факт. (Здесь и далее примеч. автора.)] и показал свою первую добычу.Это был тоненький стебелек гусиного лука, облепленный комьями земли и листьями.

public class Main {
    public static void main(String[] args) {
        Moomin moomin = new Moomin("joe");
        Environment.Tree tree = new Environment.Tree(10, "green");
        moomin.flyOver(tree.treetop);

        // Hemul hemul = new Hemul("jesse", ClothingType.PANTS);
        Hemul hemul = new Hemul("jesse", ClothingType.SKIRT);
        hemul.analyseCollection(Arrays.asList("joe", "donald", "barrack"));

        try {
            hemul.showoffClothes();
        } catch (UglyClothesException e) {
            System.err.println(e.getMessage());
        }

        Character wizardsHat = new Character("Wizard's Hat", "real hat") {
            @Override
            public String toString() {
                return "WizardsHat{%s}".formatted(this.getSpecies());
            }
        };
        System.out.println(wizardsHat.toString());

    }
}
