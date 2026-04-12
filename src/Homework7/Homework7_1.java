package Homework7;

/*
Задача 1: Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
Вывести найденные строки и их длину.
 */

import java.util.Scanner;

public class Homework7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.println("Введите первую строку:");
                String text1 = scanner.nextLine();

                System.out.println("Введите вторую строку:");
                String text2 = scanner.nextLine();

                System.out.println("Введите третью строку:");
                String text3 = scanner.nextLine();

                String shorttext = text1;
                String longtext = text1;

                if (text2.length() < shorttext.length()) {
                    shorttext = text2;
                }
                if (text2.length() > longtext.length()) {
                    longtext = text2;
                }

                if (text3.length() < shorttext.length()) {
                    shorttext = text3;
                }
                if (text3.length() > longtext.length()) {
                    longtext = text3;
                }

                System.out.println("Самая короткая строка: " + shorttext + " длина: " + shorttext.length());
                System.out.println("Самая длинная строка: " + longtext + " длина: " + longtext.length());
            }
        }
