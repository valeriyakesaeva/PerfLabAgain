package Homework3;

import java.util.Random;
import java.util.Scanner;

//Задача 6: Проверить, является ли массив возрастающей последовательностью (каждое следующее число больше предыдущего).

public class Homework3_6 {
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

        boolean vozrostanie = true;

        for (int i = 1; i < massiv.length; i++) {
            if (massiv[i] <= massiv[i - 1]) {
                vozrostanie = false;
                break;
            }
        }

        if (vozrostanie) {
            System.out.println("Массив возрастающий");
        } else {
            System.out.println("Массив НЕ возрастающий");
        }
        }
    }
