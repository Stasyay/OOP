import zoo.*;
import zoo.herbivores.Cow;
import zoo.herbivores.Duck;
import zoo.herbivores.Goat;
import zoo.herbivores.Hippopotamus;
import zoo.predator.Crocodile;
import zoo.predator.Eagl;
import zoo.predator.Leo;
import zoo.radio.Radio;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animalList = List.of(
            new Cow("Мурка"),
            new Duck("Дональд"),
            new Goat("Васька"),
            new Hippopotamus("Кот"),
            new Crocodile("Гена"),
            new Eagl("Кеша"),
            new Leo("Леопольд")
        );

        Zoo zoo = new Zoo(animalList, new Radio());

        for (Sayable animal: zoo.getSayable() ) {
            System.out.println(animal.say());
        }
        System.out.println("______________________");
        for (Runable animal: zoo.getRunableList() ) {
            System.out.println(((Animal)animal).getName());
            System.out.println(((Animal)animal).say());
            System.out.println(animal.getSpeedRun());
        }
        System.out.println("______________________");
        for (Flyable animal: zoo.getFlyableList() ) {
            System.out.println(((Animal)animal).getName());
            System.out.println(((Animal)animal).say());
            System.out.println(animal.getSpeedFlyable());
        }
        System.out.println("___Чемпион по скорости бега___");
        System.out.println(zoo.getRunChampion());
        System.out.println("___Чемпион по скорости полета___");
        System.out.println(zoo.getFlightChampion());
        System.out.println("___Чемпион по высоте полета___");
        System.out.println(zoo.getHightFlightChampion());
        System.out.println("___Чемпион по скорости плавания___");
        System.out.println(zoo.getSweemChampion());

    }
}