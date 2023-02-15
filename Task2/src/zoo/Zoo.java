package zoo;

import java.awt.image.renderable.RenderableImage;
import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Animal> animalList = new ArrayList<>();

    Sayable radio;
    public Zoo(List<Animal> animals, Sayable sayableobj) {
        this.radio = sayableobj;
        animalList.addAll(animals);
    }

    public void addAnimal(Animal animal){
        animalList.add(animal);
    }

    public void addAnimal(List<Animal> animals){
        animalList.addAll(animals);
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public List<Sayable> getSayable(){
        List<Sayable> sayableList = new ArrayList<>();
        for (Animal animal: animalList) {
            sayableList.add(animal);
        }
        sayableList.add(this.radio);
        return sayableList;
    }

    public List<Runable> getRunableList(){
        List<Runable> runableList = new ArrayList<>();
        for (Animal animal: this.animalList){
            if (animal instanceof Runable){
                runableList.add((Runable) animal);
            }
        }
        return runableList;
    }

    public List<Flyable> getFlyableList(){
        List<Flyable> flyableList = new ArrayList<>();
        for (Animal animal: this.animalList){
            if (animal instanceof Flyable){
                flyableList.add((Flyable) animal);
            }
        }
        return flyableList;
    }

    public List<Swimable> getSwimableList(){
        List<Swimable> sweemableList = new ArrayList<>();
        for (Animal animal: this.animalList){
            if (animal instanceof Swimable){
                sweemableList.add((Swimable) animal);
            }
        }
        return sweemableList;
    }

    public Animal getRunChampion(){
        List<Runable> runners = getRunableList();
         Runable champion = runners.get(0);
        for (Runable r : runners) {
            if (champion.getSpeedRun() < r.getSpeedRun()) {
                champion = r;
             }
        }
        return (Animal) champion;
    }

    public Animal getFlightChampion(){
        List<Flyable> flyers = getFlyableList();
        Flyable champion = flyers.get(0);
        for (Flyable f : flyers) {
            if (champion.getSpeedFlyable() < f.getSpeedFlyable()) {
                champion = f;
            }
        }
        return (Animal) champion;
    }

    public Animal getHightFlightChampion(){
        List<Flyable> flyers = getFlyableList();
        Flyable champion = flyers.get(0);
        for (Flyable f : flyers) {
            if (champion.getHightFlyable() < f.getHightFlyable()) {
                champion = f;
            }
        }
        return (Animal) champion;
    }
    public Animal getSweemChampion(){
        List<Swimable> swimmers = getSwimableList();
        Swimable champion = swimmers.get(0);
        for (Swimable f : swimmers) {
            if (champion.getSpeedSwimable() < f.getSpeedSwimable()) {
                champion = f;
            }
        }
        return (Animal) champion;
    }



}
