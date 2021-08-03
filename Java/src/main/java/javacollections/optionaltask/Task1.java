package javacollections.optionaltask;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

//1.   Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.

public class Task1 {

  public static void main(String[] args) throws IOException {
    Path path = Paths.get("src/main/resources/Original.txt");
    List<String> lines = Files.readAllLines(path);
    Collections.reverse(lines);
    BufferedWriter writer = new BufferedWriter(
        new FileWriter("src/main/resources/ReverseOrder.txt"));
    lines.forEach(line -> {
      try {
        writer.write(line + "\n");
      } catch (IOException e) {
        e.printStackTrace();
      }
    });
    writer.close();
  }
}
