package zoo.herbivores;

import zoo.Flyable;
import zoo.Herbivores;
import zoo.Runable;
import zoo.Swimable;

public class Duck extends Herbivores implements Flyable, Runable, Swimable {

    private int flightSpeed = 40;
    private int flightHight = 2;
    private int runSpeed = 10;
    private int swimSpeed = 8;

    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Кря";
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

    @Override
    public int getSpeedSwimable() {
        return this.swimSpeed;
    }
}
