package Homework3;

import java.util.Random;
import java.util.Scanner;

//Задача 5: Пройти по массиву и поменять местами элементы первый и последний, второй и предпоследний и т.д.

public class Homework3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scanner.nextInt();

        int[] massiv = new int[n];
        Random random = new Random();
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(n);
            System.out.println("massiv[" + i + "] = " + massiv[i]);
        }

        for (int i = 0; i < massiv.length / 2; i++) {
            int temp = massiv[i];
            massiv[i] = massiv[massiv.length - 1 - i];
            massiv[massiv.length - 1 - i] = temp;
        }

        System.out.println("После перестановки:");
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + " ");
        }
    }
}
