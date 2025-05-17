package Assignment05;
public class Polymorphism {
    public int a , b, c;
    public Polymorphism(int a, int b) {
        this.a = a;
        this.b = b;
        this.c=0;
    }
    public Polymorphism(int a,int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int addNumber(int a, int b) {
        return a + b;
    }

    public int addNumber(int a, int b, int c) {
        return a + b +c;
    }

    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism(1,2);
        Polymorphism obj1 = new Polymorphism(10,20,30);
        System.out.println("Sum of two numbers: " + obj.addNumber(obj.a, obj.b));
        System.out.println("Sum of three numbers: " + obj1.addNumber(obj1.a, obj1.b, obj1.c));
    }

}
