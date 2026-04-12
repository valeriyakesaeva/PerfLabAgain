package Homework5_1;

public class Terapevt extends Doctor {
    public void assignDoctor(Client client) {
        int plan = client.getTerapevtPlan();

        if (plan == 1) {
            client.setDoctor(new Hirurg());
        } else if (plan == 2) {
            client.setDoctor(new Dantist());
        } else {
            client.setDoctor(new Terapevt());
        }

        client.getDoctor().heal();
    }

    @Override
    public void heal() {
        System.out.println("Терапевт лечит простые болезни");
    }
}
