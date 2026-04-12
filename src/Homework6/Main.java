package Homework6;

/*
Задача 1: Создать класс с как минимум 4 разными методами, в каждом методе добавить проверку на исключительные ситуации, используя:
1. try- catch 2. try-catch, где catch будет несколько 3. try -catch, с использованием multi - catch 4. try-catch-finally
Продемонстрировать обработку исключительных ситуаций на примерах
 */

public class Main {
    public static void main(String[] args) {
        Fail demo = new Fail();

        demo.methodOne();
        demo.methodTwo();
        demo.methodThree();
        demo.methodFour();
    }
}
