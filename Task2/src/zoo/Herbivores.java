package zoo;

import zoo.Animal;

public abstract class Herbivores extends Animal {
    public Herbivores(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "трава";
    }
}
