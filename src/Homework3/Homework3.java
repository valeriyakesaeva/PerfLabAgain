package Homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scanner.nextInt();
        Random random = new Random();
        int[] massiv = new int[n];
        for (int i = 0; i < massiv.length; i++) {
        massiv[i] = random.nextInt(n);
        System.out.println("massiv[" + i + "] = " + massiv[i]);
            }
        }
    }
