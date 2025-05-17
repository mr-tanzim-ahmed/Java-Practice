package Class4;

public class A {
    public int getNumber(int a,int b){
        return  a+b;
    }
    public String addString(String s1, String s2){
        return  s1+" "+s2;
    }
    public  void printNumber(int a){
        System.out.println("Number: "+a);
    }
    public void printString(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        A a = new A();

        int m=10, n=5;
        int add= a.getNumber(m,n);
        a.printNumber(add);

        String str1= "SQA", str2="Learning Academy";
        String S =a.addString(str1,str2);
        a.printString(S);

    }

}
