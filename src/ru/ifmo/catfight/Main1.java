package ru.ifmo.catfight;

public class Main1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat(120, "Downing street", 12);
        Cat cat2 = new Cat(150, "Downing2 street", 25);
        cat1.fightCat(cat2);
        System.out.println(cat1.getHealth());
        cat2.fightCat(cat1);
        System.out.println(cat2.getHealth());
    }
}
