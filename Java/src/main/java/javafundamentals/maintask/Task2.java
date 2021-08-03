package javafundamentals.maintask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Отобразить в окне консоли аргументы командной строки в обратном порядке.

public class Task2 {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String reverse = new StringBuffer(reader.readLine()).reverse().toString();
    System.out.println(reverse);
  }
}
