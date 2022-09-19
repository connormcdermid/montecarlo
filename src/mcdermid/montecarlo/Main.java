package mcdermid.montecarlo;

import mcdermid.montecarlo.entities.*;
import java.util.ArrayList;

public class Main {

    public static int combat() {
        //spawn entities
        Wyvern dragon = new Wyvern(); // one dragon
        /*
        Minion[] minions = new Minion[] { // four minions
                new Minion(), new Minion(), new Minion(), new Minion()
        };
        */
         ArrayList<Minion> minions = new ArrayList<>() {{ // sloppy DBI
             add(new Minion());
             add(new Minion());
             add(new Minion());
             add(new Minion());
         }};
        Human human = new Human(); // one human

        System.out.println("Entities spawned.");
        System.out.println("Beginning combat...");
        //combat rounds follow

        //ROUND ONE
        System.out.println("Round 1: ");
        System.out.println("Minion damage: ");
        for (Minion m : minions) {
            int x = m.shoot(human); // record damage number of attack
            human.damage(x); // damage target
            System.out.println(x); // report damage
        }
        System.out.println("Dragon damage: ");
        int x = dragon.bite(human);
        human.damage(x);
        System.out.println(x);
        System.out.println("Human damage to Dragon: ");
        x = human.sinkhole(dragon);
        dragon.damage(x);
        System.out.println(x);

        //ASSESS DAMAGE
        if (!human.isAlive()) {
            System.out.println("The human is dead!");
            System.out.println(human.getHealth());
            return 0;
        }
        if (!dragon.isAlive()) {
            System.out.println("The dragon is vanquished!");
            System.out.println(dragon.getHealth());
            return 1;
        }
        for (int i = 0; i < minions.size(); i++) {
            if (!minions.get(i).isAlive()) {
                System.out.println("Minion " + (i + 1) + " is dead!");
                minions.remove(i);
            }
        }
        System.out.println("The fight continues...");

        // ROUND 2
        System.out.println("Round 2: ");
        System.out.println("Minion Damage:");
        for (int i = 0; i < minions.size(); i++) {
            if (i == 1) {
                x = minions.get(i).spear(human);
                human.damage(x);
                System.out.println(x);
            } else {
                x = minions.get(i).shoot(human);
                human.damage(x);
                System.out.println(x);
            }
        }
        System.out.println("Dragon Damage:");
        x = dragon.stinger(human);
        human.damage(x);
        System.out.println(x);

        if (dragon.isAlive()) {
            System.out.println("Human damage to Dragon:");
            x = human.hiBlast(dragon);
            dragon.damage(x);
            System.out.println(x);
        }
        //ASSESS DAMAGE
        if (!human.isAlive()) {
            System.out.println("The human is dead!");
            System.out.println(human.getHealth());
            return 0;
        }
        if (!dragon.isAlive()) {
            System.out.println("The dragon is vanquished!");
            System.out.println(dragon.getHealth());
            return 1;
        }
        for (int i = 0; i < minions.size(); i++) {
            if (!minions.get(i).isAlive()) {
                System.out.println("Minion " + (i + 1) + " is dead!");
                minions.remove(i);
            }
        }
        System.out.println("The fight continues...");
        // ROUND 3
        System.out.println("Round 3:");
        //noinspection DuplicatedCode
        System.out.println("Minion Damage:");
        for (int i = 0; i < minions.size(); i++) {
            if (i == 1) {
                x = minions.get(i).spear(human);
                human.damage(x);
                System.out.println(x);
            } else {
                x = minions.get(i).shoot(human);
                human.damage(x);
                System.out.println(x);
            }
        }
        System.out.println("Dragon Damage:");
        x = dragon.claws(human);
        human.damage(x);
        System.out.println(x);

        System.out.println("Human Damage:");
        x = human.psyBlast(dragon);
        dragon.damage(x);
        System.out.println(x);

        //ASSESS DAMAGE
        if (!human.isAlive()) {
            System.out.println("The human is dead!");
            System.out.println(human.getHealth());
            return 0;
        }
        if (!dragon.isAlive()) {
            System.out.println("The dragon is vanquished!");
            System.out.println(dragon.getHealth());
            return 1;
        }
        for (int i = 0; i < minions.size(); i++) {
            if (!minions.get(i).isAlive()) {
                System.out.println("Minion " + (i + 1) + " is dead!");
                minions.remove(i);
            }
        }
        System.out.println("The fight continues...");

        // ROUND 4
        System.out.println("Round 4:");
        System.out.println("Minion Damage: ");
        for (int i = 0; i < minions.size(); i++) {
            if (i <= 2) {
                x = minions.get(i).spear(human);
                human.damage(x);
                System.out.println(x);
                continue;
            }
            x = minions.get(i).shoot(human);
            human.damage(x);
            System.out.println(x);
        }

        System.out.println("Dragon Damage:");
        x = dragon.bite(human);
        human.damage(x);
        System.out.println(x);

        System.out.println("Human Damage: ");
        x = human.psyBlast(dragon);
        dragon.damage(x);
        System.out.println(x);

        //ASSESS DAMAGE
        if (!human.isAlive()) {
            System.out.println("The human is dead!");
            System.out.println(human.getHealth());
            return 0;
        }
        if (!dragon.isAlive()) {
            System.out.println("The dragon is vanquished!");
            System.out.println(dragon.getHealth());
            return 1;
        }
        for (int i = 0; i < minions.size(); i++) {
            if (!minions.get(i).isAlive()) {
                System.out.println("Minion " + (i + 1) + " is dead!");
                minions.remove(i);
            }
        }
        System.out.println("The fight continues...");

        //ROUND 5
        System.out.println("Round 5: ");

        System.out.println("Minion Damage: ");
        for (int i = 0; i < minions.size(); i++) {
            if (i <= 2) {
                x = minions.get(i).spear(human);
                human.damage(x);
                System.out.println(x);
                continue;
            }
            x = minions.get(i).shoot(human);
            human.damage(x);
            System.out.println(x);
        }

        System.out.println("Dragon Damage:");
        x = dragon.bite(human);
        human.damage(x);
        System.out.println(x);

        System.out.println("Human Damage: ");
        x = human.psyBlast(dragon);
        dragon.damage(x);
        System.out.println(x);

        //ASSESS DAMAGE
        if (!human.isAlive()) {
            System.out.println("The human is dead!");
            System.out.println(human.getHealth());
            return 0;
        }
        if (!dragon.isAlive()) {
            System.out.println("The dragon is vanquished!");
            System.out.println(dragon.getHealth());
            return 1;
        }
        for (int i = 0; i < minions.size(); i++) {
            if (!minions.get(i).isAlive()) {
                System.out.println("Minion " + (i + 1) + " is dead!");
                minions.remove(i);
            }
        }
        System.out.println("The fight continues...");
        return 0;
    }

    public static void main(String[] args) {
        int fights = Integer.parseInt(args[0]);
        int total = 0;
        // count the total number of victories out of 100
        for (int i = 0; i < fights; i++) {
            total += combat();
        }
        System.out.println("The human won " + total + " times out of " + fights + ".");
        System.out.println("That's " + (( (float) total / fights) * 100) + "% of the time.");
    }
}
