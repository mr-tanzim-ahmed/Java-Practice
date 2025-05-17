package Assignment05;

public class GrandFather {

    public   String grandFatherName;
    public   int grandFatherAge;

    public GrandFather(String str, int a){
        this.grandFatherName = str;
        this.grandFatherAge = a;
    }

    public GrandFather() {

    }

    public  void grandFatherAbout(){
        System.out.println(this.grandFatherName+" -> "+this.grandFatherAge);
    }

}
