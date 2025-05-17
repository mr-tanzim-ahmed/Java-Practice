package Assignment05;

public class Father extends GrandFather {

    public String fatherName;
    public int fatherAge;

    public Father(String str, int a) {
        this.fatherAge= a;
        this.fatherName= str;
    }

    public Father() {
    }

    public void fatherAbout() {
        this.grandFatherAbout();
        System.out.println(this.fatherName+" -> "+this.fatherAge);
    }
}
