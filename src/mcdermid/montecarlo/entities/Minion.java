package mcdermid.montecarlo.entities;
import mcdermid.montecarlo.Die;

public class Minion extends Creature {

    public Minion() {
        this.setHealth(20);
        this.setArmourClass(13);
    }

    public int spear(Creature target) {
        Die d20 = new Die(20);
        Die d8 = new Die(8);
        int dmg = 0;
        if (d20.roll() + 4 >= target.armourClass) { // if atk roll greater than target armour class
            dmg = d8.roll() + 2; // then hit
        } // else miss
        return dmg;
    }

    public int shoot(Creature target) {
        Die d20 = new Die(20);
        Die d8 = new Die(8);
        int dmg = 0;
        if (d20.roll() + 3 >= target.armourClass) { // if atk roll greater than target armour class
            dmg = d8.roll(); // then hit
        } // else miss
        return dmg;
    }

    @Override
    public int conroll() {
        Die d20 = new Die(20);
        return d20.roll();
    }

}
