package javafundamentals.maintask;

//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt() + " ");
        }
    }
}
