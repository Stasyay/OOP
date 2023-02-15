package zoo.predator;

import zoo.Predator;
import zoo.Runable;
import zoo.Sayable;
import zoo.Swimable;

public class Crocodile extends Predator implements Runable, Swimable {
   private int runSpeed = 50;
   private int swimSpeed = 20;

   public Crocodile(String name) {
        super(name);
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }

    @Override
    public int getSpeedSwimable() {
        return this.swimSpeed;
    }

    @Override
    public String say() {
        return "Шшшшш";
    }

}
