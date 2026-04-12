package Homework4_2;

    /*
    Задача 2: Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате,
    должен задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100.
    Сделать метод для добавления денег в банкомат.
    Сделать функцию, снимающую деньги, которая принимает сумму денег,
    а возвращает булевое значение - успешность выполнения операции.
    При снятии денег, функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
    Создать конструктор с тремя параметрами - количеством купюр каждого номинала
     */

    public class ATM {

        int count20;
        int count50;
        int count100;

        public ATM(int count20, int count50, int count100) {
            this.count20 = count20;
            this.count50 = count50;
            this.count100 = count100;
        }

        public void addMoney(int add20, int add50, int add100) {
            count20 += add20;
            count50 += add50;
            count100 += add100;
        }

        public boolean withdraw(int amount) {
            int need100 = Math.min(amount / 100, count100);
            amount -= need100 * 100;

            int need50 = Math.min(amount / 50, count50);
            amount -= need50 * 50;

            int need20 = Math.min(amount / 20, count20);
            amount -= need20 * 20;

            if (amount == 0) {
                System.out.println("Выдано:");
                System.out.println("100: " + need100);
                System.out.println("50: " + need50);
                System.out.println("20: " + need20);
                return true;
            } else {
                return false;
            }
        }
    }
