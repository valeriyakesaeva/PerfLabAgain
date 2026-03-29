package Homework3;

import java.util.Random;
import java.util.Scanner;

//Задача 2: Найти минимальный - максимальный элементы и вывести в консоль.

public class Homework3_2 {
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

        int min = massiv[0];
        int max = massiv[0];

        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] < min) {
                min = massiv[i];
            }
            if (massiv[i] > max) {
                max = massiv[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
            }

        }
