package zoo.predator;

import zoo.Flyable;
import zoo.Predator;
import zoo.Runable;

public class Eagl extends Predator implements Flyable, Runable {

    private int runSpeed = 6;
    private int flightSpeed = 50;
    private int flightHight = 1;
    public Eagl(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "тьяф";
    }

    @Override
    public int getSpeedFlyable() {
        return this.flightSpeed;
    }

    @Override
    public int getHightFlyable() {
        return this.flightHight;
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }
}
