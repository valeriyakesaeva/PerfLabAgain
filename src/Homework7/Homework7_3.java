package Homework7;

/*
Задача 3: Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше средней, а также их длину
 */

import java.util.Scanner;

public class Homework7_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String text1 = scanner.nextLine();

        System.out.println("Введите вторую строку:");
        String text2 = scanner.nextLine();

        System.out.println("Введите третью строку:");
        String text3 = scanner.nextLine();

        double sredn = ((text1.length() + text2.length() + text3.length())/3.0);
        System.out.println(sredn);

        if (text1.length() < sredn) {
            System.out.println(text1 + " длина: " + text1.length());
        }
        if (text2.length() < sredn) {
            System.out.println(text2 + " длина: " + text2.length());
        }
        if (text3.length() < sredn) {
        System.out.println(text3 + " длина: " + text3.length());
        }
        }
    }
