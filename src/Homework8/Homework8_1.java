package Homework8;

/*
Задача 1: Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3, 4, 4, 5".
Избавиться от повторяющихся элементов в строке. Вывести результат на экран. При решении использовать коллекции.
 */

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Homework8_1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите числа через запятую:");
            String input = scanner.nextLine();

            String[] numbers = input.split(",");

            Set<String> unique = new LinkedHashSet<>(Arrays.asList(numbers));

            System.out.println("Без повторов: " + unique);
        }
    }
