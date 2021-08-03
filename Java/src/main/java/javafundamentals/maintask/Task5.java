package javafundamentals.maintask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;

//Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
//Осуществить проверку корректности ввода чисел.

public class Task5 {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int month = Integer.parseInt(reader.readLine());
    String date = new DateFormatSymbols().getMonths()[month];
    System.out.println(date);
  }
}
