package Homework3;

import java.util.Random;
import java.util.Scanner;

//Задача 4: Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести сообщение, что их нет.

public class Homework3_4 {
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

        int zero = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == 0) {
                zero++;
            }
        }

        if (zero == 0) {
            System.out.println("Нулевых элементов нет");
        } else {
            System.out.println("Нулевых элементов: " + zero);
        }
            }
        }
