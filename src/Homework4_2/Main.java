package Homework4_2;

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM(50, 50, 50);

        atm.addMoney(10, 10, 10);

        boolean result = atm.withdraw(1090);

        System.out.println(result);
    }
}
