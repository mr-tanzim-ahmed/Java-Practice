package Assignment05;

public class Son extends Father{
    public String sonName;
    public int sonAge;

    public Son(String str, int a) {
        this.sonAge= a;
        this.sonName= str;
    }
    public void sonAbout() {
        System.out.println(this.sonName+" -> "+this.sonAge);
    }

    public static void main(String[] args) {
        GrandFather a = new GrandFather("GrandFather", 80);
        Father b = new Father("Assignment05.Father", 50);
        Son c = new Son("Son", 25);

        a.grandFatherAbout();
        b.fatherAbout();
        c.sonAbout();
    }
}
