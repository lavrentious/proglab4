package ru.lavrent.lab3;

// Когда они вернулись домой обедать. Хемуль поджидал их на крыльце. Он весь так и сиял от радости. И он развернул полы юбки [Хемуль всегда ходил в платье, унаследованном от тетки. Подозреваю, что все хемули ходят в юбках. Странно, но факт. (Здесь и далее примеч. автора.)] и показал свою первую добычу.Это был тоненький стебелек гусиного лука, облепленный комьями земли и листьями.

public class Main {
    public static void main(String[] args) {
        Hemul hemul = new Hemul("Gandon", ClothingType.DRESS);
        hemul.expressJoy();
        hemul.hunt("гусиный лук");
        System.out.println(hemul.toString());
        Hemul hemul2 = new Hemul("Gandon", ClothingType.DRESS);
        Hemul hemul3 = new Hemul("Pidor", ClothingType.DRESS);
        System.out.println(hemul.equals(hemul2));
        System.out.println(hemul.equals(hemul3));
        try {
            new Hemul(null, ClothingType.DRESS);
        } catch (NullPointerException e) {
            System.err.println("illegal argument");
        }

        Hemul h = new Hemul("John", null);
        System.out.println(h.toString());
    }
}
