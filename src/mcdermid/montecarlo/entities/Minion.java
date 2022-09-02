package mcdermid.montecarlo.entities;
import mcdermid.montecarlo.Die;

public class Minion extends Creature {

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    private int health = 22;

    public int armourClass = 15;

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
            dmg = d8.roll() + 1; // then hit
        } // else miss
        return dmg;
    }

    @Override
    public int conroll() {
        Die d20 = new Die(20);
        return d20.roll();
    }

}
