package io.task1;

import java.io.*;
import java.nio.file.*;
import java.util.stream.Collectors;

/**
 * Написать класс, который копирует содержимое из одного файла в другой.
 * Используем классы BufferedReader, FileReader, BufferedWriter, FileWriter.
 */

public class CopyFileDemo {

    public static void main(String[] args) {

        File file = Path.of("src","io","task1","file.txt").toFile();
        File copyFile = Path.of("src","io","task1","copyFile.txt").toFile();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(copyFile))) {

            String text = bufferedReader.lines()
                    .collect(Collectors.joining("\n"));
            bufferedWriter.write(text);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
