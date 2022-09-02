package mcdermid.montecarlo.entities;

public abstract class Creature {

    private int health;

    public int armourClass;

    private boolean alive = true;

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

    public abstract int conroll();
}
