package randomShit.attendance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class AttendanceDemo {

    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog("Kona"),
                new Dog("Rex"),
                new Dog("Bailey")
        };

        Cat[] cats = {
                new Cat("Whiskers"),
                new Cat("Cher"),
                new Cat("Stevie")
        };

        Animal[] dogsAndCats = new Animal[dogs.length + cats.length];
        int index = 0;

        for (Dog dog : dogs) {
            dogsAndCats[index++] = dog;
        }

        for (Cat cat : cats) {
            dogsAndCats[index++] = cat;
        }

        Collection<Dog> dogCollection = new ArrayList<>(Arrays.asList(dogs));

        printAnimals("Dogs array", dogs);
        printAnimals("Cats array", cats);
        printAnimals("Dogs and cats array", dogsAndCats);

        System.out.println("Dog collection:");
        for (Dog dog : dogCollection) {
            System.out.println(" - " + dog.describe());
        }
    }

    private static void printAnimals(String label, Animal[] animals) {
        System.out.println(label + ":");
        for (Animal animal : animals) {
            System.out.println(" - " + animal.describe());
        }
        System.out.println();
    }
}
