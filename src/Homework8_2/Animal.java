package Homework8_2;

/*
Задача 2: Создать класс, который будет хранить в себе коллекцию с названиями животных.
Реализовать методы удаления и добавления животных по следующим правилам: добавляется всегда в начало коллекции,
а удаляется всегда из конца. Показать работу объекта этого класса в main методе другого класса.
 */

import java.util.LinkedList;

public class Animal {
        private LinkedList<String> animals = new LinkedList<>();

        public void addAnimal(String animal) {
            animals.addFirst(animal);
        }

        public void removeAnimal() {
            if (!animals.isEmpty()) {
                animals.removeLast();
            }
        }

        public void printAnimals() {
            System.out.println(animals);
        }
    }
