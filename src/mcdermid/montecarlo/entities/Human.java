package mcdermid.montecarlo.entities;

import mcdermid.montecarlo.Die;

public class Human extends Creature {

    public Human() {
        this.setHealth(75);
        this.setArmourClass(16);
    }

    public int sinkhole(Creature target) {
        Die d10 = new Die(10);
        int dmg = 0;
        for (int i = 0; i < 5; i++) {
            dmg += d10.roll();
        }
        if (target.conroll() >= 15) {
            return dmg/2; // if target succeeds con save, half damage
        }
        return dmg; // failed con save, full damage
    }

    public int hiBlast(Creature target) {
        Die d8 = new Die(8);
        return psyBlast(target) + (target.conroll() >= 15 ? d8.roll() : d8.roll()/2); // if success, half damage
    }

    public int psyBlast(Creature target) {
        Die d8 = new Die(8);
        int dmg = 0;
        for (int i = 0; i < 5; i++) {
            dmg += d8.roll();
        }
        if (target.conroll() >= 15) {
            return dmg / 2;
        }
        return dmg;
    }

    @Override
    public int conroll() {
        Die d20 = new Die(20);
        return d20.roll() + 4;
    }
}
