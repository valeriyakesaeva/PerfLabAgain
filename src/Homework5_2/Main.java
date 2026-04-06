package Homework5_2;

/*
Задача 2: Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя абстрактный класс/методы).
Создать массив из 5 разных фигур. Вывести на экран сумму периметра всех фигур в массиве
 */

public class Main {

    public static void main(String[] args) {

        Figure[] figures = new Figure[5];

        figures[0] = new Triangle(3, 4, 5);
        figures[1] = new Rectangle(4, 6);
        figures[2] = new Circle(3);
        figures[3] = new Rectangle(2, 8);
        figures[4] = new Triangle(5, 5, 6);

        double sumPerimeter = 0;

        for (Figure figure : figures) {
            sumPerimeter += figure.getPerimeter();
        }

        System.out.println("Сумма периметров: " + sumPerimeter);
    }
}
