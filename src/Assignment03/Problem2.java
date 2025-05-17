package class3;
class CourseA{
    public int age;
    public String name;
    public CourseA(int age, String name){
        this.age = age;
        this.name = name;
    }
    public void person(){
        System.out.println("Name: "+name+", Age: "+age);
    }
}
public class Problem2 {
    public static void main(String[] args) {
        CourseA obj = new CourseA(20, "Tahsin");
        obj.person();
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
