package mcdermid.montecarlo.entities;

import mcdermid.montecarlo.Die;

public class Wyvern extends Creature {

    private int health = 110;

    public int armourClass = 13;

    @Override
    public int conroll() {
        Die d20 = new Die(20);
        return d20.roll() + 3;
    }

    public int bite(Creature target) {
        Die d20 = new Die(20);
        Die d6 = new Die(6);
        int dmg = 0;
        if (d20.roll() + 7 >= target.armourClass) {
            dmg = d6.roll() + d6.roll() + 4;
        }
        return dmg;
    }

    public int stinger(Creature target) {
        Die d20 = new Die(20);
        Die d6 = new Die(6);
        int dmg = 0;
        int pdmg = 0;
        for (int i = 0; i < 7; i++) {
            pdmg += d6.roll();
        }
        if (d20.roll() + 7 >= target.armourClass) {
            dmg = d6.roll() + d6.roll() + 4;
        } else {
            pdmg = 0;
        }
        if (target.conroll() >= 15) {
            return dmg + (pdmg/2);
        }
        return dmg + pdmg;
    }
}
