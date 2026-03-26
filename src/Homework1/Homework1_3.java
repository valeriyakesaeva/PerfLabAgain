public class Homework1_3 {

    public static void main(String[] args) {
        int n = 126;
        int n1 = n / 100;
        int n2 = n % 100;
        int n3 = n2 / 10;
        int n4 = n2 % 10;
        int sum = n1 + n3 + n4;
        System.out.println(sum);
    }
}