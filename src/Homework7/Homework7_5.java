package Homework7;

/*
Задача 5: Вывести на консоль новую строку, которой задублирована каждая буква из начальной строки.
Например, "Hello" -> "HHeelllloo"
 */

public class Homework7_5 {
    public static void main(String[] args) {
String text1 = "Hello";
String text2 = " ";
for (int i = 0; i < text1.length(); i++) {
    text2 += text1.charAt(i);
    text2 += text1.charAt(i);
}
    System.out.print(text2);
}

    }