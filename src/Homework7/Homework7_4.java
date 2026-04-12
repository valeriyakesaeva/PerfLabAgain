package Homework7;

/*
Задача 4: Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
Если таких слов несколько, найти первое из них.
 */

import java.util.Scanner;

public class Homework7_4 {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.println("Введите первую строку:");
String text1 = scanner.nextLine();

System.out.println("Введите вторую строку:");
String text2 = scanner.nextLine();

System.out.println("Введите третью строку:");
String text3 = scanner.nextLine();

boolean result1 = true;

for (int i = 0; i < text1.length(); i++) {
    for (int j = i + 1; j < text1.length(); j++) {

        if (text1.charAt(i) == text1.charAt(j)) {
            result1 = false;
            break;
        }
    }

    if (!result1) break;
}

boolean result2 = true;

for (int i = 0; i < text2.length(); i++) {
    for (int j = i + 1; j < text2.length(); j++) {

        if (text2.charAt(i) == text2.charAt(j)) {
            result2 = false;
            break;
        }
    }

    if (!result2) break;
}

boolean result3 = true;

for (int i = 0; i < text3.length(); i++) {
    for (int j = i + 1; j < text3.length(); j++) {

        if (text3.charAt(i) == text3.charAt(j)) {
            result3 = false;
            break;
        }
    }

    if (!result3) break;
}

                if (result1) {
                    System.out.println("Ответ: " + text1);
                } else if (result2) {
                    System.out.println("Ответ: " + text2);
                } else if (result3) {
                    System.out.println("Ответ: " + text3);
                } else {
                    System.out.println("Нет подходящего слова");
                }
            }
        }