package Homework6;

public class Fail {
    public void methodOne() {
        try {
            int result = 10 / 0; // ошибка
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        }
    }
    public void methodTwo() {
        try {
            int[] arr = new int[3];
            arr[5] = 10; // ошибка: выход за границы
        } catch (ArithmeticException e) {
            System.out.println("Арифметическая ошибка");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за границы массива");
        }
    }
    public void methodThree() {
        try {
            String text = null;
            System.out.println(text.length()); // NullPointerException
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Ошибка: null или Арифметическая ошибка");
        }
    }
    public void methodFour() {
        try {
            String number = "abc";
            int result = Integer.parseInt(number); // ошибка
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неправильный формат числа");
        } finally {
            System.out.println("finally");
        }
    }
}
