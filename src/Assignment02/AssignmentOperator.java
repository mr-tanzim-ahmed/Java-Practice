package Assignment02;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a += b;
        System.out.println("a += b : " + a);

        a -= b;
        System.out.println("a -= b : " + a);

        a *= b;
        System.out.println("a *= b : " + a);

        a /= b;
        System.out.println("a /= b : " + a);

        a %= b;
        System.out.println("a %= b : " + a);
    }
}
