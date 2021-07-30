package javafundamentals.optionaltask;

//Задание. Ввести n чисел с консоли.
//1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
//2. Вывести числа в порядке возрастания (убывания) значений их длины.
//3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task {
    static String[] numbers;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of numbers");
        int num = Integer.parseInt(reader.readLine());
        System.out.println("Enter numbers");
        int[] nums = new int[num];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }
        numbers = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numbers[i] = String.valueOf(nums[i]);
        }
        printShortestAndLongestNumber();
        printNumbersInAscendingAndDescendingOrderOfLength();
        printNumbersLessAndGreaterThanAverageLength();
    }

    public static void printShortestAndLongestNumber() {
        String min = numbers[0];
        String max = numbers[0];
        for (String number : numbers) {
            if (number.length() < min.length()) min = number;
            if (number.length() > max.length()) max = number;
        }
        System.out.println("Самые короткие и длинные числа, их длина:");
        System.out.println("Shortest number: " + min + " length: " + min.length());
        System.out.println("Longest number: " + max + " length: " + max.length());
    }

    public static void printNumbersInAscendingAndDescendingOrderOfLength() {
        System.out.println("Числа в порядке возрастания значений их длины:");
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j + 1].length() < numbers[j].length()) {
                    String temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        for (String num : numbers) {
            System.out.println(num);
        }
        System.out.println("Числа в порядке убывания значений их длины:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }

    public static void printNumbersLessAndGreaterThanAverageLength() {
        System.out.println("Числа, длина которых меньше средней длины по всем числам, их длина:");
        int sum = 0;
        for (String number : numbers) {
            sum += number.length();
        }
        double average = (double) sum / numbers.length;
        for (String number : numbers)
            if (number.length() < average) {
                System.out.println(number + " length: " + number.length());
            }
        System.out.println("Числа, длина которых больше средней длины по всем числам, их длина:");
        for (String number : numbers)
            if (number.length() > average) {
                System.out.println(number + " length: " + number.length());
            }
    }
}