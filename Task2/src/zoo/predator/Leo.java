package zoo.predator;

import zoo.Predator;
import zoo.Runable;

public class Leo extends Predator implements Runable {

    private int runSpeed = 70;
    public Leo(String name) {
        super(name);
    }
    @Override
    public String say() {
        return "Ppppp!";
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }
}
