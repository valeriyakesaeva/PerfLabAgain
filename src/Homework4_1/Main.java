package Homework4_1;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(1, 100);
        CreditCard card2 = new CreditCard(2, 200);
        CreditCard card3 = new CreditCard(3, 300);

        card1.addMoney(50);
        card2.addMoney(100);
        card3.withdrawMoney(70);

        card1.printInfo();
        card2.printInfo();
        card3.printInfo();
    }
}
