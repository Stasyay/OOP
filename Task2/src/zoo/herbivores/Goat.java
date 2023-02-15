package zoo.herbivores;

import zoo.Flyable;
import zoo.Herbivores;
import zoo.Runable;

public class Goat extends Herbivores implements Flyable, Runable {

    private int flightSpeed = 30;
    private int flightHight = 1;
    private int runSpeed = 11;

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

    public Goat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Меее!";
    }
}
