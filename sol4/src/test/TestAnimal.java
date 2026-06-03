package test;

import domain.Wolf;

/**
 * Тестовий клас — демонструє роботу ієрархії успадкування на прикладі вовка.
 */
public class TestAnimal {

    public static void main(String[] args) {

        Wolf wolf = new Wolf("Shadow", 45, 5,
                             "elk", "Iron Fang Pack", 11,
                             "Alpha", "black");

        System.out.println(wolf);

        wolf.speak();
        wolf.eat();
        wolf.move();
        wolf.sleep();
        wolf.hunt();
        wolf.ambush();
        wolf.huntWithPack();
        wolf.markTerritory();
        wolf.howl();
        wolf.playWithPups();
        wolf.dominance();
    }
}
