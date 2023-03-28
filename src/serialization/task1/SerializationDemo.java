package serialization.task1;

import java.io.*;
import java.nio.file.Path;

/**
 * Создайте метод, который сериализует класс Horse (наследник класса Animal) в файл.
 * И метод, который десериализует его.
 */

public class SerializationDemo {

    public static void main(String[] args) {

        File file = Path.of("src", "serialization", "task1","file").toFile();
        Horse horse = new Horse("Marusya", true);

        System.out.println(horse); // Horse{name=Marusya, there are horseshoes=true}
        inFile(file,horse);
        horse = outFile(file);
        System.out.println(horse); // Horse{name=Marusya, there are horseshoes=true}
    }

    private static void inFile (File file, Horse horse) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(horse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Horse outFile (File file) {
        Horse horse = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            horse = (Horse) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return horse;
    }
}
