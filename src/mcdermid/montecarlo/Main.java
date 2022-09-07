package mcdermid.montecarlo;

import mcdermid.montecarlo.entities.*;

public class Main {

    public static void main(String[] args) {
        //spawn entities
        Wyvern dragon = new Wyvern(); // one dragon
        Minion[] minions = new Minion[] { // eight minions
                new Minion(), new Minion(), new Minion(), new Minion()
        };
        Human human = new Human(); // one human

        System.out.println("Entities spawned.");
        System.out.println("Beginning combat...");
        //combat rounds follow

        //ROUND ONE
        System.out.println("Round 1: ");
        System.out.println("Minion damage: ");
        for (Minion m : minions) {
            int x = m.shoot(human);
            human.damage(x);
            System.out.println(x);
        }
        System.out.println("Dragon damage: ");
        int x = dragon.bite(human);
        human.damage(x);
        System.out.println(x);
        System.out.println("Human damage to Dragon: ");
        x = human.sinkhole(dragon);
        dragon.damage(x);
        System.out.println(x);
        System.out.println("Human damage to Minions: ");
        for (Minion m : minions) {
            x = human.sinkhole(m);
            m.damage(x);
            System.out.println(x);
        }
        //ASSESS DAMAGE
        if (!human.isAlive()) {
            System.out.println("The human is dead!");
            System.out.println(human.getHealth());
            return;
        }
        if (!dragon.isAlive()) {
            System.out.println("The dragon is vanquished!");
            System.out.println(dragon.getHealth());
            return;
        }
        for (int i = 0; i < minions.length; i++) {
            if (!minions[i].isAlive()) {
                System.out.println("Minion " + (i + 1) + " is dead!");
            }
        }
        System.out.println("The fight continues...");

    }
}
