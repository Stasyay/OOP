package zoo.herbivores;

import zoo.Herbivores;
import zoo.Runable;

public class Cow extends Herbivores implements Runable {
    private int runSpeed = 10;
    public Cow(String name) {
        super(name);
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }

    @Override
    public String say() {
        return "Мууу";
    }
}
