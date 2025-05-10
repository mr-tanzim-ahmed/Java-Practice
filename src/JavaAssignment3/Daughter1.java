package JavaAssignment3;

public class Daughter1 extends GrandFather1 {
    public String daughterName;
    public int daughterAge;
    public Daughter1(String str, int a) {
        this.daughterAge= a;
        this.daughterName= str;
    }
    public void daughterAbout() {
        System.out.println(this.daughterName+" -> "+this.daughterAge);
    }

    public static void main(String[] args) {
        GrandFather1 a = new GrandFather1("GrandFather", 80);
        Father1 b = new Father1("Father", 50);
        Daughter1 c = new Daughter1("Daughter", 25);

        a.grandFatherAbout();
        b.fatherAbout();
        c.daughterAbout();
    }
}
