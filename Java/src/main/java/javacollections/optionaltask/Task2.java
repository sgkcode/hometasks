package javacollections.optionaltask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 2.   Ввести число, занести его цифры в стек.
// Вывести число, у которого цифры идут в обратном порядке.

public class Task2 {

  public static void main(String[] args) throws IOException {
    StringBuilder numberInReverseOrder = new StringBuilder();
    Stack<Integer> digits = new Stack<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int number = Integer.parseInt(reader.readLine());
    for (int i = 0; i < Integer.toString(number).length(); i++) {
      digits.push(Integer.parseInt(String.valueOf(Integer.toString(number).charAt(i))));
    }
    while (!digits.isEmpty()) {
      numberInReverseOrder.append(digits.pop());
    }
    System.out.println(numberInReverseOrder);
  }
}
