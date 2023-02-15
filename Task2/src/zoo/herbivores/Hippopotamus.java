package zoo.herbivores;

import zoo.Herbivores;
import zoo.Runable;
import zoo.Swimable;

public class Hippopotamus extends Herbivores implements Runable, Swimable {

    private int runSpeed = 30;
    private int swimSpeed = 35;

    public Hippopotamus(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Ыыыы";
    }

    @Override
    public int getSpeedRun() {
        return runSpeed;
    }

    @Override
    public int getSpeedSwimable() {
        return swimSpeed;
    }
}
