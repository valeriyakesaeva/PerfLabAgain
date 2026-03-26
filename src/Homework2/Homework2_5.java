package Homework2;

import java.util.Scanner;

public class Homework2_5 {

    /*
    Задача *: Напишите программу, где пользователь вводит любое целое положительное число.
    А программа суммирует все числа от 1 до введенного пользователем числа.
    Для ввода числа воспользуйтесь классом Scanner.
    Сделать проверку, чтобы пользователь не мог ввести некорректные данные
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное целое число");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                System.out.println(sum);
            } else {
                System.out.println("Число должно быть больше 0");
            }
        } else {
            System.out.println("Введите целое число");
        }
    }
}