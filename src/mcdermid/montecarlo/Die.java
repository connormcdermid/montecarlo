package mcdermid.montecarlo;

import java.util.Random;

public class Die {
    private final int MAX;
    private final int MIN = 1;

    private final Random inst;

    public Die(int sides) {
        this.MAX = sides;
        this.inst = new Random();
    }

    public int roll() {
        return inst.nextInt(this.MAX - this.MIN) + this.MIN;
    }
}
