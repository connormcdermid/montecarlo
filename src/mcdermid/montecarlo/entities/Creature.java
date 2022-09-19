package mcdermid.montecarlo.entities;

public abstract class Creature {

    public int getArmourClass() {
        return armourClass;
    }

    public void setArmourClass(int armourClass) {
        this.armourClass = armourClass;
    }

    private int health; // each creature has health. If this runs out, the creature dies.

    public int armourClass; // each creature has an armour class. Attack rolls lower than this miss, others hit.

    private boolean alive = true; // is the creature alive?

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean damage(int dmg) {
        this.health -= dmg;
        if (this.health <= 0) {
            this.alive = false;
        }
        return false;
    }

    public boolean isAlive() {
        return this.alive;
    }

    public abstract int conroll();
}
