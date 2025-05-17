package Assignment05;

public class Daughter extends GrandFather {
    public String daughterName;
    public int daughterAge;
    public Daughter(String str, int a) {
        this.daughterAge= a;
        this.daughterName= str;
    }
    public void daughterAbout() {
        System.out.println(this.daughterName+" -> "+this.daughterAge);
    }

    public static void main(String[] args) {
        GrandFather a = new GrandFather("GrandFather", 80);
        Father b = new Father("Assignment05.Father", 50);
        Daughter c = new Daughter("Assignment05.Daughter", 25);

        a.grandFatherAbout();
        b.fatherAbout();
        c.daughterAbout();
    }
}
