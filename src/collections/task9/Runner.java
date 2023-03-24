package collections.task9;

import java.util.HashMap;
import java.util.Map;

/**
 * Создайте класс Pet и его наследников Cat, Dog, Parrot.
 * Создайте отображение из домашних животных,
 * где в качестве ключа выступает имя животного, а в качестве значения класс Pet.
 * Добавьте в отображение разных животных. Создайте метод выводящий на консоль все ключи отображения.
 */

public class Runner {

    public static void main(String[] args) {

        Map<String, Pet> pets = new HashMap<>();
        Pet cat = new Cat("Мурка");
        Pet dog = new Cat("Шарик");
        Pet parrot = new Cat("Кеша");

        pets.put(cat.getName(), cat);
        pets.put(dog.getName(), dog);
        pets.put(parrot.getName(), parrot);

        printPets(pets);
    }
    private static void printPets(Map<String, Pet> pets) {
        for (String name : pets.keySet()) {
            System.out.println(name);
        }
    }
}
