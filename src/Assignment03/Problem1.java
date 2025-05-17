package class3;
public class Problem1 {
    public int age;
    public String name;
    public Problem1(int age, String name){
        this.age = age;
        this.name = name;
    }
    public void person(){
        System.out.println("Name: "+name+", Age: "+age);
    }
}
