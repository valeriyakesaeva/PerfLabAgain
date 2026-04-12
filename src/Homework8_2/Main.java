package Homework8_2;

public class Main {
        public static void main(String[] args) {
            Animal zoo = new Animal();

            zoo.addAnimal("Кот");
            zoo.addAnimal("Собака");
            zoo.addAnimal("Хомяк");

            zoo.printAnimals();

            zoo.removeAnimal();

            zoo.printAnimals();
        }
    }
