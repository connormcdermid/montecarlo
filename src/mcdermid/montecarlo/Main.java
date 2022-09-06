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
        for (Minion m : minions) {
            human.damage(m.shoot(human));
        }
        human.damage(dragon.bite(human));
        dragon.damage(human.sinkhole(dragon));
        for (Minion m : minions) {
            m.damage(human.sinkhole(m));
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
