package Homework7;

/*
Задача 2: Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания значений их длины.
 */

import java.util.Scanner;

public class Homework7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String text1 = scanner.nextLine();

        System.out.println("Введите вторую строку:");
        String text2 = scanner.nextLine();

        System.out.println("Введите третью строку:");
        String text3 = scanner.nextLine();

        String temp;

        if (text1.length() > text2.length()) {
        temp = text1;
        text1 = text2;
        text2 = temp;
        }
        if (text2.length() > text3.length()) {
        temp = text2;
        text2 = text3;
        text3 = temp;
        }
        if (text1.length() > text2.length()) {
            temp = text1;
            text1 = text2;
            text2 = temp;
        }

        System.out.println("Строки по возрастанию длины:");
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
    }
}
