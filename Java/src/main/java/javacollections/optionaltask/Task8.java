package javacollections.optionaltask;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

// 8. Задан файл с текстом на английском языке. Выделить все различные слова.
// Слова, отличающиеся только регистром букв, считать одинаковыми. Использовать класс HashSet.

public class Task8 {

  public static void main(String[] args) {
    HashSet<String> hashSet = new HashSet<>();
    try {
      FileReader fileReader = new FileReader("src/main/resources/EnglishText.txt");
      Scanner scanner = new Scanner(fileReader);
      while (scanner.hasNext()) {
        hashSet.addAll(Arrays.asList(scanner.next()
            .toLowerCase()
            .split("[\\W\\d]")));
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    hashSet.remove("");
    hashSet.stream()
        .sorted()
        .forEach(System.out::println);
  }
}
